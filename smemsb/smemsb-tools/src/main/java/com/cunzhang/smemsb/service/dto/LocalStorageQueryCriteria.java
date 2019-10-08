package com.cunzhang.smemsb.service.dto;

import lombok.Data;
import com.cunzhang.smemsb.annotation.Query;

/**
* @author wtCunZhang
* @date 2019-09-05
*/
@Data
public class LocalStorageQueryCriteria{

    // 模糊
    @Query(blurry = "name,suffix,type,operate,size")
    private String blurry;
}