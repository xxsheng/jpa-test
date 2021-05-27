package jpa.test.model.pojo;

import jpa.test.model.enums.ResourceStatusEnum;
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
@Table(name = "ad_column", schema = "ad_serving", catalog = "")
@EntityListeners({AuditingEntityListener.class})
@Audited
public class AdColumn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long applicationId;
    private String name;
    private String uuid;
    private String titleImageUrl;
    private Long columnTemplateId;
    private Long contentTemplateId;
    private boolean useExternalColumn;
    private String externalUrl;
    private String displayUrl;
    private String remark;
    private boolean deletedFlag;
    private boolean valid;
    private boolean home;
    private Long sort;
    private Long parentId;
    private String configJson;
    private String draftConfigJson;
    private Instant deployDate;
    @Enumerated(EnumType.STRING)
    private ResourceStatusEnum status;
    @CreatedBy
    private String createdBy;
    @CreatedDate
    private Instant createdDate;
    @LastModifiedBy
    private String lastModifiedBy;
    @LastModifiedDate
    private Instant lastModifiedDate;
    private Instant publishStartDate;
    private Instant publishEndDate;
    /**
     * 栏目首页id
     */
    private Long pageId;

    private String deployTaskId;

    private String undeployTaskId;

}
