package com.example.contactcaller.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonDto {
    long id;
    String name;
    int age;
    String number;
    String address;

}
