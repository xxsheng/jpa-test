package jpa.test.dal.jpa;

import jpa.test.model.enums.ResourceStatusEnum;
import jpa.test.model.pojo.AdColumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ColumnRepositry extends JpaRepository<AdColumn, Long> {
    List<AdColumn> findAllByApplicationIdAndDeletedFlagFalseOrderBySortAsc(Long applicationId);
    AdColumn findOneByIdAndDeletedFlagFalseAndApplicationId(Long id, Long applicationId);

    @Query("select t from AdColumn t where t.deletedFlag = false and (t.columnTemplateId = :templateId or t.contentTemplateId = :templateId)")
    List<AdColumn> findAllByTemplateId(@Param("templateId") Long templateId);

    AdColumn findByIdAndAndDeletedFlagFalse(Long id);

    AdColumn findByApplicationIdAndUuidAndDeletedFlagFalse(Long appId, String uuid);

    int countByApplicationIdAndDeletedFlagFalseAndStatus(Long applicationId, ResourceStatusEnum status);

    @Query("select t.id from AdColumn t where t.deletedFlag = false and t.parentId in :parentId")
    List<Long> findColumnIdByQuery(@Param("parentId") List<Long> parentId);
}
