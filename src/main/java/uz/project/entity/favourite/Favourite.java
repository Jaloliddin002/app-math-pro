package uz.project.entity.favourite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.project.entity.motivation.Motivation;
import uz.project.entity.theme.Theme;
import uz.project.entity.user.User;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Favourite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Theme theme;

    @ManyToOne
    private Motivation motivation;
}

