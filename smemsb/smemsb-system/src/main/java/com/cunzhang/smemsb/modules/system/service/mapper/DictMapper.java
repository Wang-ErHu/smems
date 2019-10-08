package com.cunzhang.smemsb.modules.system.service.mapper;

import com.cunzhang.smemsb.mapper.EntityMapper;
import com.cunzhang.smemsb.modules.system.domain.Dict;
import com.cunzhang.smemsb.modules.system.service.dto.DictDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author wtCunZhang
* @date 2019-04-10
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictMapper extends EntityMapper<DictDTO, Dict> {

}