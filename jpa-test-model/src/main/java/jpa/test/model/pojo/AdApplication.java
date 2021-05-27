package jpa.test.model.pojo;

import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@Table(name = "ad_application", schema = "ad_serving", catalog = "")
@EntityListeners({AuditingEntityListener.class})
@Audited
public class AdApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String uuid;
    private long saveId;
    private String description;
    private boolean deletedFlag;
    @CreatedDate
    private Instant createdDate;
    @CreatedBy
    private String createdBy;
    @LastModifiedDate
    private Instant lastModifiedDate;
    @LastModifiedBy
    private String lastModifiedBy;

}
