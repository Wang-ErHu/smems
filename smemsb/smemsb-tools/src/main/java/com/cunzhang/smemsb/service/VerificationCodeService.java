package com.cunzhang.smemsb.service;

import com.cunzhang.smemsb.domain.VerificationCode;
import com.cunzhang.smemsb.domain.vo.EmailVo;

/**
 * @author wtCunZhang
 * @date 2018-12-26
 */
public interface VerificationCodeService {

    /**
     * 发送邮件验证码
     * @param code
     */
    EmailVo sendEmail(VerificationCode code);

    /**
     * 验证
     * @param code
     */
    void validated(VerificationCode code);
}
