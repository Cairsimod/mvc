package com.aust.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 会在tomcat启动时被执行
 */
public class SpringWebmvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootContextConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebContextConfig.class};
    }

    @Override
    protected String[] getServletMappings() {//何种请求会被DispatcherServlet拦截
        return new String[]{"/"};
    }
}
