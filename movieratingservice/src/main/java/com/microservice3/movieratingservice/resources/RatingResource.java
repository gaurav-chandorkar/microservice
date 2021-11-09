package com.microservice3.movieratingservice.resources;

import com.microservice3.movieratingservice.models.Rating;
import com.microservice3.movieratingservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){

        return new Rating(movieId,4);
    }
    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){

        List<Rating> ratings = Arrays.asList(new Rating("1234", 5),
                new Rating("5678", 4));
        UserRating userRating=new UserRating();
        userRating.setRatingList(ratings);
        return userRating;
    }
}
