package uz.project.entity.test;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.project.entity.test.Test;
import uz.project.entity.user.User;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class UserTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Test test;

    private boolean isTrue;
}
