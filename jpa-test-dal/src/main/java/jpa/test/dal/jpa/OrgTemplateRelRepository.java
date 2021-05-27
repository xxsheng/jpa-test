package jpa.test.dal.jpa;

import jpa.test.model.pojo.OrgTemplateRel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrgTemplateRelRepository extends JpaRepository<OrgTemplateRel, Long> {
    OrgTemplateRel findOneByTemplateIdAndOrgId(Long templateId, String orgId);
    List<OrgTemplateRel> findAllByTemplateIdInAndOrgId(List<Long> templateIds, String orgId);
    Long countByTemplateIdAndOrgId(Long templateId, String orgId);
    void deleteAllByTemplateIdAndOrgId(Long templateId, String orgId);
}
