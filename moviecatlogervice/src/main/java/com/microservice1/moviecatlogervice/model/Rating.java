package com.microservice1.moviecatlogervice.model;


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
