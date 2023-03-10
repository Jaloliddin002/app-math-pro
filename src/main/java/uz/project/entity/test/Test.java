package uz.project.entity.test;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.project.audit.Auditable;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Test extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String question;

    @ManyToMany
    private List<Answer> options ;

    @ManyToOne
    private Answer answer;
}
