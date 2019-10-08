package com.cunzhang.smemsb.modules.system.repository;

import com.cunzhang.smemsb.modules.system.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

/**
 * @author wtCunZhang
 * @date 2018-12-03
 */
public interface RoleRepository extends JpaRepository<Role, Long>, JpaSpecificationExecutor {

    /**
     * findByName
     * @param name
     * @return
     */
    Role findByName(String name);

    Set<Role> findByUsers_Id(Long id);

    @Modifying
    @Query(value = "delete from roles_permissions where permission_id = ?1",nativeQuery = true)
    void untiedPermission(Long id);

    @Modifying
    @Query(value = "delete from roles_menus where menu_id = ?1",nativeQuery = true)
    void untiedMenu(Long id);
}
