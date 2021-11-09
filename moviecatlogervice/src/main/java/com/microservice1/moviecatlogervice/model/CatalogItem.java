package com.microservice1.moviecatlogervice.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CatalogItem {
    String name;
    String desc;
    int rating;
}
