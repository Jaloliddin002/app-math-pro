package uz.project.entity.attachment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.project.entity.attachment.Attachment;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class AttachmentContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] contentBytes;

    @OneToOne
    private Attachment attachment;
}
