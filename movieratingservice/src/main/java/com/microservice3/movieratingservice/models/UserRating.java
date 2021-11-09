package com.microservice3.movieratingservice.models;

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
