package jpa.test.model.pojo;

import jpa.test.model.enums.TagLevelEnum;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import javax.persistence.*;
@Entity
@Data
@Table(name = "ad_tag", schema = "ad_serving", catalog = "")
@EntityListeners({AuditingEntityListener.class})
@Audited
public class AdTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private long applicationId;
    private String code;
    @Enumerated(EnumType.STRING)
    private TagLevelEnum level;
    private boolean valid;
    private String description;
    private String remark;
    @CreatedBy
    private String createdBy;
    @CreatedDate
    private Instant createdDate;
    @LastModifiedBy
    private String lastModifiedBy;
    @LastModifiedDate
    private Instant lastModifiedDate;

}
