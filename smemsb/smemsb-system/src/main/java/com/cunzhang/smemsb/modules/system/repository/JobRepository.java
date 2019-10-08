package com.cunzhang.smemsb.modules.system.repository;

import com.cunzhang.smemsb.modules.system.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author wtCunZhang
* @date 2019-03-29
*/
public interface JobRepository extends JpaRepository<Job, Long>, JpaSpecificationExecutor {
}