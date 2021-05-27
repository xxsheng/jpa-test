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
@Table(name = "ad_page", schema = "ad_serving", catalog = "")
@EntityListeners({AuditingEntityListener.class})
@Audited
public class AdPage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Long columnId;
    private Long applicationId;
    private String title;
    private String subTitle;
    private String titleImageUrl;
    private String description;
    private Long templateId;
    private String configJson;
    private String draftConfigJson;
    private String status;
    private String displayUrl;
    private Long sort;
    private boolean deletedFlag;
    private Instant deployDate;
    private Long tagLevel;
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

    private String deployTaskId;
    private String undeployTaskId;

    public AdPage() {
    }

    public AdPage(AdColumn column) {
        this.columnId = column.getId();
        this.applicationId = column.getApplicationId();
        this.title = column.getName();
        this.titleImageUrl = column.getTitleImageUrl();
        this.templateId = column.getColumnTemplateId();
        this.configJson = column.getConfigJson();
        this.draftConfigJson = column.getDraftConfigJson();
        this.status = column.getStatus().getCode();
        this.displayUrl = column.getDisplayUrl();
        this.sort = column.getSort();
        this.deployDate = column.getDeployDate();
        this.publishStartDate = column.getPublishStartDate();
        this.publishEndDate = column.getPublishEndDate();
        this.lastModifiedBy = column.getLastModifiedBy();
        this.lastModifiedDate = column.getLastModifiedDate();
        this.deployTaskId = column.getDeployTaskId();
        this.undeployTaskId = column.getUndeployTaskId();
    }
}
