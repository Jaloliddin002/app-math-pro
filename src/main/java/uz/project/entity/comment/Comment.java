package uz.project.entity.comment;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.project.audit.Auditable;
import uz.project.entity.user.User;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Comment extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;

    @ManyToOne()
    private User user;
}
