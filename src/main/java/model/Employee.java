package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Employee {
    private int id;
    private String name;
    private String lastname;
    private String gender;
    private int age;
    private int cityId;

    public Employee(String name, String lastname, String gender, int age, int cityId) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.cityId = cityId;
    }
}
