package com.cunzhang.smemsb.modules.system.service.mapper;

import com.cunzhang.smemsb.mapper.EntityMapper;
import com.cunzhang.smemsb.modules.system.domain.Role;
import com.cunzhang.smemsb.modules.system.service.dto.RoleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author wtCunZhang
 * @date 2018-11-23
 */
@Mapper(componentModel = "spring", uses = {PermissionMapper.class, MenuMapper.class, DeptMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper extends EntityMapper<RoleDTO, Role> {

}
