package com.cunzhang.smemsb.modules.system.service.mapper;

import com.cunzhang.smemsb.mapper.EntityMapper;
import com.cunzhang.smemsb.modules.system.domain.Role;
import com.cunzhang.smemsb.modules.system.service.dto.RoleSmallDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author wtCunZhang
 * @date 2019-5-23
 */
@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleSmallMapper extends EntityMapper<RoleSmallDTO, Role> {

}
