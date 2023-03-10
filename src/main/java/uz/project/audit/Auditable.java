package uz.project.audit;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;


import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class Auditable<T> {

    @Column(nullable = false,updatable = false)
    @CreatedBy
    private T createdBy;

    @LastModifiedBy
    private T lastModifiedBy;

    @Column(nullable = false,updatable = false)
    @CreationTimestamp
    private Date creationDate;

    @LastModifiedDate
    private Date updateDate;
}
