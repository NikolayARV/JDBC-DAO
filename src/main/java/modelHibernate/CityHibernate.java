package modelHibernate;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "city")
public class CityHibernate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")

    private int cityId;
    @Column (name = "city_name")
    private String name;
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<EmployeeHibernate> employeeHibernateList = new HashSet<>();

    public CityHibernate(String name) {
        this.name = name;
    }
}
