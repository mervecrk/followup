package com.bilgeadam.instructorcourseapp.audit;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class AuditModel {

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name = "olusturulma_trh", nullable = false, updatable = false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(name = "son_guncellenme_trh", nullable = false)
    private Date updatedAt;

}
