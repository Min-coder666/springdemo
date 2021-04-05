package com.min.filterConfig;

import com.min.filter.TestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<TestFilter> filterFilterRegistrationBean(){
        FilterRegistrationBean<TestFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new TestFilter());
        filterFilterRegistrationBean.addUrlPatterns("/*");
        return filterFilterRegistrationBean;
    }
}
