package jpa.test.dal.jpa;

import jpa.test.model.pojo.AdPage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PageRepository extends JpaRepository<AdPage, Long> {
    Optional<AdPage> findOneByIdAndColumnIdAndDeletedFlagFalse(Long id, Long columnId);

    List<AdPage> findAllByTemplateIdAndDeletedFlagFalse(Long templateId);

    List<AdPage> findAllByApplicationIdAndDeletedFlagFalse(Long applicationId);

    List<AdPage> findAllByTemplateIdAndApplicationIdAndDeletedFlagFalse(Long templateId, Long applicationId);

    AdPage findByIdAndDeletedFlagFalse(Long id);

    int countByApplicationIdAndDeletedFlagFalseAndStatus(Long application, String deployState);
}
