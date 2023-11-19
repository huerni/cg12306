

package org.huerni.cg12306.biz.userservice.controller;

import lombok.RequiredArgsConstructor;
import org.huerni.cg12306.biz.userservice.dto.req.UserLoginReqDTO;
import org.huerni.cg12306.biz.userservice.dto.resp.UserLoginRespDTO;
import org.huerni.cg12306.biz.userservice.service.UserLoginService;
import org.huerni.cg12306.framework.starter.bases.result.Result;
import org.opengoofy.index12306.framework.starter.web.Results;
import org.springframework.web.bind.annotation.*;

/**
 * 用户登录控制层
 *
 * @公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
@RestController
@RequiredArgsConstructor
public class UserLoginController {

    private final UserLoginService userLoginService;

    /**
     * 用户登录
     */
    @PostMapping("/api/user-service/v1/login")
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginReqDTO requestParam) {
        return Results.success(userLoginService.login(requestParam));
    }

    /**
     * 通过 Token 检查用户是否登录
     */
    @GetMapping("/api/user-service/check-login")
    public Result<UserLoginRespDTO> checkLogin(@RequestParam("accessToken") String accessToken) {
        UserLoginRespDTO result = userLoginService.checkLogin(accessToken);
        return Results.success(result);
    }

    /**
     * 用户退出登录
     */
    @GetMapping("/api/user-service/logout")
    public Result<Void> logout(@RequestParam(required = false) String accessToken) {
        userLoginService.logout(accessToken);
        return Results.success();
    }
}
