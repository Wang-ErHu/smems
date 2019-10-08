package com.cunzhang.smemsb.modules.quartz.service.dto;

import com.cunzhang.smemsb.annotation.Query;
import lombok.Data;

/**
 * @author wtCunZhang
 * @date 2019-6-4 10:33:02
 */
@Data
public class JobQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String jobName;

    @Query
    private Boolean isSuccess;
}
