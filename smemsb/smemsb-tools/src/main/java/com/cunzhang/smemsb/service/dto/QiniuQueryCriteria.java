package com.cunzhang.smemsb.service.dto;

import lombok.Data;
import com.cunzhang.smemsb.annotation.Query;

/**
 * @author wtCunZhang
 * @date 2019-6-4 09:54:37
 */
@Data
public class QiniuQueryCriteria{

    @Query(type = Query.Type.INNER_LIKE)
    private String key;
}
