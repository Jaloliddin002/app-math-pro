package uz.project.entity.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.project.audit.Auditable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserDetails extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String middleName;

    private String phoneNumber;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    private String email;

    private String passport;

    private String school;

    private String address;
}
