package com.cunzhang.smemsb.repository;

import com.cunzhang.smemsb.domain.QiniuConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author wtCunZhang
 * @date 2018-12-31
 */
public interface QiNiuConfigRepository extends JpaRepository<QiniuConfig,Long> {

    @Modifying
    @Query(value = "update qiniu_content set type = ?1", nativeQuery = true)
    void update(String type);
}
