package com.tjx.xinuser.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class DruidConfig {



    @ConfigurationProperties(prefix = "master.datasource")
    @Bean
    public DataSource dataSource(){
        return  new DruidDataSource();
    }

    @Bean
    public PlatformTransactionManager txManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
   public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws IOException {
       SqlSessionFactoryBean sqlSessionFactory=new SqlSessionFactoryBean();
       sqlSessionFactory.setDataSource(dataSource);
       sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/*.xml"));
       return sqlSessionFactory;
   }

   @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactoryBean sqlSessionFactoryBean) throws Exception {
       SqlSessionTemplate sqlSessionTemplate=new SqlSessionTemplate(sqlSessionFactoryBean.getObject());
       return sqlSessionTemplate;
   }






}
