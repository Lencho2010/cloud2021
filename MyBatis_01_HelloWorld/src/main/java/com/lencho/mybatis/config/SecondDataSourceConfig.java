package com.lencho.mybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author Lencho
 * @create 2021-07-31 8:13
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "second.datasource.druid")
public class SecondDataSourceConfig {

    private static final String MAPPER_LOCATION = "classpath:mapper/*.xml";
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Bean(name = "secondDataSource")
    public DataSource getSecondDataSource() throws SQLException {
        DruidDataSource druid = new DruidDataSource();

        // 配置基本属性
        druid.setDriverClassName(driverClassName);
        druid.setUsername(username);
        druid.setPassword(password);
        druid.setUrl(url);
        System.out.println(driverClassName);
        return druid;
    }

    @Bean(name = "secondTransactionManager")
    public DataSourceTransactionManager secondTransactionManager() throws SQLException {
        return new DataSourceTransactionManager(getSecondDataSource());
    }

    @Bean(name = "secondSqlSessionFactory")
    public SqlSessionFactory getSecondSqlSessionFactory(@Qualifier("secondDataSource") DataSource secondDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(secondDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(SecondDataSourceConfig.MAPPER_LOCATION));

        return sessionFactory.getObject();
    }
}
