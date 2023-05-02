package modelHibernate;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "employee")
public class EmployeeHibernate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String name;
    @Column(name = "last_name")
    private String lastname;
    private String gender;
    private int age;
    @Column(name = "city_id")

    private int cityId;

    public EmployeeHibernate(String name, String lastname, String gender, int age, int cityId) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.cityId = cityId;
    }
}
