package com.microservice1.moviecatlogervice.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRating {

    private List<Rating> ratingList;
}
