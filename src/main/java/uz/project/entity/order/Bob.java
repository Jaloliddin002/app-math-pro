package uz.project.entity.order;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.project.entity.course.Course;
import uz.project.entity.test.Test;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Bob {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int orderNumber;

    @ManyToOne
    private Course course;

    private String definition;

    @ManyToMany()
    private List<Test> tests;
}
