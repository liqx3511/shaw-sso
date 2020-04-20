package com.shaw.ssoInterface;

import com.alibaba.fastjson.JSONObject;
import com.shaw.framework.aspectj.lang.annotation.Log;
import com.shaw.framework.security.LoginUser;
import com.shaw.framework.security.service.TokenService;
import com.shaw.framework.web.request.RequestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: sso
 * @Package: com.shaw.ssoInterface
 * @ClassName: TokenVerify
 * @Author: liqingxiao
 * @Description: 验证token 信息
 * @Date: 2020/4/20 10:09
 * @Version: 1.0
 */
@RestController
@RequestMapping("/permission")
public class TokenVerify {
    @Autowired
    TokenService tokenService;

    @PostMapping("/info")
    @Log
    public Object getPermission(HttpServletRequest request) {
        LoginUser loginUser = tokenService.getLoginUser(request);
        return JSONObject.toJSON(loginUser);
    }
}