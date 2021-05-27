package jpa.test.dal.jpa;

import jpa.test.model.pojo.PageTagRel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PageTagRelRepository extends JpaRepository<PageTagRel, Long> {
    List<PageTagRel> findAllByPageId(Long pageId);

    List<PageTagRel> findAllByTagId(Long tagId);

    Integer deleteAllByPageId(Long pageId);

    Integer deleteAllByTagId(Long tagId);

    void deleteAllByTagIdIn(List<Long> tagIds);

    List<PageTagRel> findByTagIdIn(List<Long> tagIds);
}
