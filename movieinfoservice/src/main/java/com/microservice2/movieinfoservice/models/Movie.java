package com.microservice2.movieinfoservice.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Movie {
    public String movieID;
    public String name;

}
