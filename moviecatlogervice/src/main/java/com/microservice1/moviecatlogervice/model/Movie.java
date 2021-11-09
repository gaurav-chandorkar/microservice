package com.microservice1.moviecatlogervice.model;

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
