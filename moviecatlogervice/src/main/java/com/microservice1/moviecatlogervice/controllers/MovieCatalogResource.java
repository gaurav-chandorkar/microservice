package com.microservice1.moviecatlogervice.controllers;

import com.microservice1.moviecatlogervice.model.CatalogItem;
import com.microservice1.moviecatlogervice.model.Movie;
import com.microservice1.moviecatlogervice.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@RestController()
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    WebClient.Builder webClientBuilder;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/{userID}", method = RequestMethod.GET)
    public List<CatalogItem> gtCatalog(@PathVariable("userID") String userID) {

        UserRating userRating = restTemplate.getForObject("http://movie-rating-service/ratingsdata/users/tt", UserRating.class);

        return userRating.getRatingList().stream().map(rating -> {

                    Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);

                    return new CatalogItem(movie.getName(), "Test desc 1", rating.getRating());
                })
                .collect(Collectors.toList());

        /* return Collections.singletonList(new CatalogItem("X-men","Test desc",4));*/
    }

         /*Movie movie = webClientBuilder.build()
                            .get()
                            .uri("http://localhost:8082/movies/" + rating.getMovieId())
                            .retrieve()
                            .bodyToMono(Movie.class)
                            .block();*/
}
