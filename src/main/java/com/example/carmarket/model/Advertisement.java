package com.example.carmarket.model;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Advertisement implements Serializable {
    private long id;
    private User user;
    private String heading;
    private String description;
    private LocalDateTime created;
}
