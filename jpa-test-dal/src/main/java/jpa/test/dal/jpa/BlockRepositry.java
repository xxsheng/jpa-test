package jpa.test.dal.jpa;

import jpa.test.model.pojo.AdBlock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlockRepositry extends JpaRepository<AdBlock, Long> {

    List<AdBlock> findAllByIdInAndApplicationId(List<Long> ids, Long applicationId);

    List<AdBlock> findByApplicationIdAndName(Long applicationId, String name);
}
