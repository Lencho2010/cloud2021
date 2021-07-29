package com.lencho.springcloud.resolver;

import com.lencho.springcloud.entities.Payment;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * @Package: com.lencho.springcloud.resolver
 * @ClassName: AuthParamResolver
 * @Author: Lencho
 * @CreateTime: 2021/7/29 13:11
 * @Description:
 */
public class AuthParamResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getParameterType().equals(Payment.class);
        /*return false;*/
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        //Payment payment = methodParameter.getMethodAnnotation(Payment.class);
        // 通过 webRequest 和 whitelist 校验白名单
        return new Payment();
    }
}
