package com.cunzhang.smemsb.service.mapper;

import com.cunzhang.smemsb.domain.LocalStorage;
import com.cunzhang.smemsb.service.dto.LocalStorageDTO;
import com.cunzhang.smemsb.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author wtCunZhang
* @date 2019-09-05
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LocalStorageMapper extends EntityMapper<LocalStorageDTO, LocalStorage> {

}