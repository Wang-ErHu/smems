package com.cunzhang.smemsb.service.dto;

import lombok.Data;
import com.cunzhang.smemsb.annotation.Query;

/**
 * sm.ms图床
 *
 * @author wtCunZhang
 * @date 2019-6-4 09:52:09
 */
@Data
public class PictureQueryCriteria{

    @Query(type = Query.Type.INNER_LIKE)
    private String filename;
    
    @Query(type = Query.Type.INNER_LIKE)
    private String username;
}
