package jpa.test.dal.jpa;

import jpa.test.model.pojo.AdTemplateAuth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TemplateAuthRepository extends JpaRepository<AdTemplateAuth, Long> {
    List<AdTemplateAuth> findAllBySourceIdIn(List<Long> sourceId);

    List<AdTemplateAuth> findAllByTargetIdIn(List<Long> targetId);
    List<AdTemplateAuth> findAllByTargetIdInAndDeletedFlagTrue(List<Long> targetId);

    Optional<AdTemplateAuth> findOneBySourceIdAndTargetId(Long sourceId, Long targetId);

    Optional<AdTemplateAuth> findOneById(Long id);

    void deleteAllBySourceIdIn(List<Long> sourceIds);

    List<AdTemplateAuth> findBySourceIdAndApplicationIdIn(Long sourceTemplateId, List<Long> applicationIds);

    int countBySourceIdAndDeletedFlagFalse(Long sourceTemplateId);

    AdTemplateAuth findByTargetIdAndApplicationIdAndDeletedFlagFalse(Long targetId, Long applicationId);

    int countByTargetIdAndDeletedFlagTrue(Long targetTemplateId);

    AdTemplateAuth findBySourceIdAndApplicationId(Long sourceTemplateId, Long applicationId);

    AdTemplateAuth findByTargetIdAndDeletedFlagFalse(Long targetTemplateId);
}
