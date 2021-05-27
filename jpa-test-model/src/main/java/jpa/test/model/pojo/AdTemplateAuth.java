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
@Table(name = "ad_template_auth", schema = "ad_serving", catalog = "")
@EntityListeners({AuditingEntityListener.class})
@Audited
public class AdTemplateAuth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // 应用下模版ID
    private long targetId;
    // 商户下模版ID
    private long sourceId;
    private boolean deletedFlag;
    // 应用id
    private Long applicationId;
    @CreatedBy
    private String createdBy;
    @CreatedDate
    private Instant createdDate;
    @LastModifiedBy
    private String lastModifiedBy;
    @LastModifiedDate
    private Instant lastModifiedDate;
}
