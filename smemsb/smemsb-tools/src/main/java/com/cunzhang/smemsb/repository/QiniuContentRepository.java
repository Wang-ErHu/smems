package com.cunzhang.smemsb.repository;

import com.cunzhang.smemsb.domain.QiniuContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author wtCunZhang
 * @date 2018-12-31
 */
public interface QiniuContentRepository extends JpaRepository<QiniuContent,Long>, JpaSpecificationExecutor {

    /**
     * 根据key查询
     * @param key
     * @return
     */
    QiniuContent findByKey(String key);
}
