package jpa.test.model.pojo;

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
@Table(name = "ad_template", schema = "ad_serving", catalog = "")
@EntityListeners({AuditingEntityListener.class})
@Audited
public class AdTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String version;
    private String type;
    private String description;
    private boolean valid;
    private boolean deletedFlag;
    private String configJson;
    private String thumbnailUrl;
    @CreatedBy
    private String createdBy;
    @CreatedDate
    private Instant createdDate;
    @LastModifiedBy
    private String lastModifiedBy;
    @LastModifiedDate
    private Instant lastModifiedDate;
}
