package models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    private Long id;
    private String name;
    private LocalDate birthday;
    private Integer age;
}
