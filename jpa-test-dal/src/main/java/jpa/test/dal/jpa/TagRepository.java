package jpa.test.dal.jpa;

import jpa.test.model.pojo.AdTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TagRepository extends JpaRepository<AdTag, Long> {
    List<AdTag> findAllByIdIn(List<Long> ids);

    Optional<AdTag> findOneByIdAndApplicationId(Long id, Long applicationId);

    List<AdTag> findAllByIdInAndApplicationId(List<Long> ids, Long applicationId);

    List<AdTag> findByApplicationIdAndCodeIn(Long id, List<String> codes);

    List<AdTag> findByCodeIn(List<String> codes);

    @Query("select t from AdTag t where t.applicationId = :applicationId and (t.code = :code or t.name = :name)")
    List<AdTag> findByApplicationIdAndCodeOrName(@Param("applicationId") Long applicationId, @Param("code") String code, @Param("name") String name);
}
