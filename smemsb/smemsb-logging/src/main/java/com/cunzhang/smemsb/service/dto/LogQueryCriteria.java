package com.cunzhang.smemsb.service.dto;

import com.cunzhang.smemsb.annotation.Query;
import lombok.Data;

/**
 * 日志查询类
 * @author wtCunZhang
 * @date 2019-6-4 09:23:07
 */
@Data
public class LogQueryCriteria {

    // 多字段模糊
    @Query(blurry = "username,description,address,requestIp,method,params")
    private String blurry;

    @Query
    private String logType;
}
