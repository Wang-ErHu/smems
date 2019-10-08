package com.cunzhang.smemsb.service.mapper;

import com.cunzhang.smemsb.mapper.EntityMapper;
import com.cunzhang.smemsb.domain.Log;
import com.cunzhang.smemsb.service.dto.LogErrorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author wtCunZhang
 * @date 2019-5-22
 */
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LogErrorMapper extends EntityMapper<LogErrorDTO, Log> {

}