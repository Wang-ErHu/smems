package com.cunzhang.smemsb.modules.system.service.dto;

import com.cunzhang.smemsb.annotation.Query;
import lombok.Data;

/**
* @author wtCunZhang
* @date 2019-04-10
*/
@Data
public class DictDetailQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String label;

    @Query(propName = "name",joinName = "dict")
    private String dictName;
}