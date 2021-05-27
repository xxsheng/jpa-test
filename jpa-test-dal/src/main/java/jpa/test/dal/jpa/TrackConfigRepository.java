package jpa.test.dal.jpa;

import jpa.test.model.pojo.TrackConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrackConfigRepository extends JpaRepository<TrackConfig, Long> {

    TrackConfig findByApplicationId(Long applicationId);

    List<TrackConfig> findAllByTrackProjectIdNotNull();
}
