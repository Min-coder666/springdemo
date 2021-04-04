package com.min.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.min.dao", sqlSessionFactoryRef = "sqlSessionFactory1")
public class DBConfig1 {

    @Autowired
    @Qualifier("db1")
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory1() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory1());
        return template;
    }
}
