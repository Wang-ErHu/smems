package com.cunzhang.smemsb.repository;

import com.cunzhang.smemsb.domain.EmailConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wtCunZhang
 * @date 2018-12-26
 */
public interface EmailRepository extends JpaRepository<EmailConfig,Long> {
}
