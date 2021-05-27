package jpa.test.dal.jpa;

import jpa.test.model.pojo.OrgAppRel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrgAppRelRepository extends JpaRepository<OrgAppRel, Long> {
    OrgAppRel findOneByApplicationIdAndOrgId(Long appId, String orgId);
    Long countByApplicationIdAndOrgId(Long appId, String orgId);
    void deleteAllByApplicationIdAndOrgId(Long appId, String orgId);

    List<OrgAppRel> findAllByApplicationIdInAndOrgId(List<Long> appIds, String orgId);
}
