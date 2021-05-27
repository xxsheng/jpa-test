package jpa.test.dal.jpa;

import jpa.test.model.pojo.AdTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TemplateRepository extends JpaRepository<AdTemplate, Long> {
    List<AdTemplate> findAllByIdInAndDeletedFlagFalse(List<Long> ids);

    Optional<AdTemplate> findOneByIdAndDeletedFlagFalse(Long id);

    List<AdTemplate> findByIdIn(List<Long> ids);

}
