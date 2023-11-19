

package org.huerni.cg12306.biz.userservice.service.handler.filter.user;

import lombok.RequiredArgsConstructor;
import org.huerni.cg12306.biz.userservice.common.enums.UserRegisterErrorCodeEnum;
import org.huerni.cg12306.biz.userservice.dto.req.UserRegisterReqDTO;
import org.huerni.cg12306.biz.userservice.service.UserLoginService;
import org.huerni.cg12306.framework.starter.bases.exception.ClientException;
import org.springframework.stereotype.Component;

/**
 * 用户注册用户名唯一检验
 *
 */
@Component
@RequiredArgsConstructor
public final class UserRegisterHasUsernameChainHandler implements UserRegisterCreateChainFilter<UserRegisterReqDTO> {

    private final UserLoginService userLoginService;

    @Override
    public void handler(UserRegisterReqDTO requestParam) {
        if (!userLoginService.hasUsername(requestParam.getUsername())) {
            throw new ClientException(UserRegisterErrorCodeEnum.HAS_USERNAME_NOTNULL);
        }
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
