package com.cunzhang.smemsb.modules.system.repository;

import com.cunzhang.smemsb.modules.system.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;

/**
 * @author wtCunZhang
 * @date 2018-12-03
 */
public interface PermissionRepository extends JpaRepository<Permission, Long>, JpaSpecificationExecutor {

    /**
     * findByName
     * @param name
     * @return
     */
    Permission findByName(String name);

    /**
     * findByPid
     * @param pid
     * @return
     */
    List<Permission> findByPid(long pid);
}
