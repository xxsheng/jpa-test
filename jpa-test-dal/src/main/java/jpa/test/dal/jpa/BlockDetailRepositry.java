package jpa.test.dal.jpa;

import jpa.test.model.pojo.BlockDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockDetailRepositry extends JpaRepository<BlockDetail, Long> {
}
