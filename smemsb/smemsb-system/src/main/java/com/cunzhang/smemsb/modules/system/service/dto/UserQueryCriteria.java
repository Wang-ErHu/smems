package com.cunzhang.smemsb.modules.system.service.dto;

import com.cunzhang.smemsb.annotation.Query;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * @author wtCunZhang
 * @date 2018-11-23
 */
@Data
public class UserQueryCriteria implements Serializable {

    @Query
    private Long id;

    @Query(propName = "id", type = Query.Type.IN, joinName = "dept")
    private Set<Long> deptIds;

    // 多字段模糊
    @Query(blurry = "email,username")
    private String blurry;

    @Query
    private Boolean enabled;

    private Long deptId;
}