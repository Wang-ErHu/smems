package com.cunzhang.smemsb.modules.system.repository;

import com.cunzhang.smemsb.modules.system.domain.UserAvatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author wtCunZhang
 * @date 2018-11-22
 */
public interface UserAvatarRepository extends JpaRepository<UserAvatar, Long>, JpaSpecificationExecutor {

}
