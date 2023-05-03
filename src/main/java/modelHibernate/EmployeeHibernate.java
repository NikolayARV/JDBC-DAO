package modelHibernate;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode (exclude = {"id"})
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
   @ManyToOne (fetch = FetchType.LAZY) //LAZY т.к. мне пока непонятна необходимость мгновенной подгрузки городов
   //и я не хочу перегружать приложение лишними запросами к БД
   @JoinColumn(name = "city_id")

    private CityHibernate city;

    public EmployeeHibernate(String name, String lastname, String gender, int age, CityHibernate city) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }
}
