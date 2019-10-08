package com.cunzhang.smemsb.modules.system.service.mapper;

import com.cunzhang.smemsb.mapper.EntityMapper;
import com.cunzhang.smemsb.modules.system.domain.Dept;
import com.cunzhang.smemsb.modules.system.service.dto.DeptSmallDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author wtCunZhang
* @date 2019-03-25
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeptSmallMapper extends EntityMapper<DeptSmallDTO, Dept> {

}