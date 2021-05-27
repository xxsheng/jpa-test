package jpa.test.dal.jpa;

import jpa.test.model.pojo.SaveConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaveConfigRepository extends JpaRepository<SaveConfig, Long> {
        SaveConfig findByIdAndValidTrueAndDeletedFlagFalse(Long id);
}
