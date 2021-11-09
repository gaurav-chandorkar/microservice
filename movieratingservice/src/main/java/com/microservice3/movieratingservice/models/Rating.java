package com.microservice3.movieratingservice.models;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rating {
    String movieId;
    int rating;
}
