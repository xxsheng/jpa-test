package jpa.test.dal.jpa;

import jpa.test.model.pojo.AppTemplateRel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppTemplateRelRepository extends JpaRepository<AppTemplateRel, Long> {
    long countByTemplateIdAndApplicationId(Long templateId, Long applicationId);

    void deleteAppTemplateRelByTemplateIdAndApplicationId(Long templateId, Long applicationId);

    List<AppTemplateRel> findAllByTemplateIdInAndApplicationId(List<Long> templateIds, Long applicationId);

    AppTemplateRel findOneByTemplateIdAndApplicationId(Long templateId, Long applicationId);

    AppTemplateRel findByTemplateId(Long id);
}
