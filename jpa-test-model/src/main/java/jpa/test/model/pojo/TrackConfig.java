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
@Table(name = "track_config", schema = "ad_serving", catalog = "")
@Data
@EntityListeners({AuditingEntityListener.class})
@Audited
public class TrackConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Long applicationId;
    private String trackPlatformId;
    private String trackProjectId;
    private String trackConfig;
    private Long pv;
    private Long uv;
    @CreatedBy
    private String createdBy;
    @CreatedDate
    private Instant createdDate;
    @LastModifiedBy
    private String lastModifiedBy;
    @LastModifiedDate
    private Instant lastModifiedDate;


}
