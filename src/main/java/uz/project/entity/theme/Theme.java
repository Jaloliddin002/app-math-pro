package uz.project.entity.theme;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.project.entity.attachment.Attachment;
import uz.project.entity.attachment.Video;
import uz.project.entity.order.Bob;
import uz.project.entity.test.Test;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private int orderNumber;

    @ManyToOne
    private Video video;

    @ManyToMany
    private List<Test> tests;

    @ManyToOne
    private Bob bob;

    @ManyToOne
    private Attachment attachment;
}
