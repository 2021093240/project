package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Configuration
public class MyLocalResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        // 获取⻚⾯⼿动切换传递的语⾔参数language的值
        String language = httpServletRequest.getParameter("language");
        // 获取请求头⾃动传递的语⾔参数Accept-Language
        String header = httpServletRequest.getHeader("Accept-Language");
        // Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6
        Locale locale = null;
        // 如果⼿动切换参数不为空，就根据⼿动参数进⾏语⾔切换，否则默认根据请求头信息切换
        if (!StringUtils.isEmpty(language)) {
            String[] split = language.split("_");
            locale = new Locale(split[0], split[1]);
        } else {
            String[] splits = header.split(",");
            String[] split = splits[0].split("-");
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse
            httpServletResponse, Locale locale) {
    }

    /**
     * 将⾃定义的MyLocalResolver类重新注册为⼀个类型MyLocalResolver的Bean组件
     */
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocalResolver();
    }



}
