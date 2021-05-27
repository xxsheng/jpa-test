package jpa.test.dal.jpa;

import jpa.test.model.pojo.AdApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<AdApplication, Long> {
    AdApplication findByIdAndDeletedFlagFalse(Long id);

    List<AdApplication> findAllBySaveIdAndDeletedFlagFalse(Long saveId);
}
