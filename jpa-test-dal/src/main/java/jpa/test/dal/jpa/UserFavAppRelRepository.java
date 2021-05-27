package jpa.test.dal.jpa;

import jpa.test.model.pojo.UserFavAppRel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserFavAppRelRepository extends JpaRepository<UserFavAppRel, Long> {
    void deleteByUserIdAndApplicationId(String userId, Long applicationId);

    UserFavAppRel findByUserIdAndApplicationId(String userId, Long applicationId);

    List<UserFavAppRel> findAllByUserId(String userId);
}
