package com.cunzhang.smemsb.repository;

import com.cunzhang.smemsb.domain.AlipayConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wtCunZhang
 * @date 2018-12-31
 */
public interface AlipayRepository extends JpaRepository<AlipayConfig,Long> {
}
