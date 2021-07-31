package com.lencho.mybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import sun.rmi.runtime.Log;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author Lencho
 * @create 2021-07-30 23:17
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "master.datasource.druid")
public class MasterDataSourceConfig {

    private static final String MAPPER_LOCATION = "classpath:mapper/*.xml";
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Primary
    @Bean(name = "masterDataSource")
    public DataSource getMasterDataSource() throws SQLException {
        DruidDataSource druid = new DruidDataSource();

        // 配置基本属性
        druid.setDriverClassName(driverClassName);
        druid.setUsername(username);
        druid.setPassword(password);
        druid.setUrl(url);
        System.out.println(driverClassName);
        return druid;
    }

    @Primary
    @Bean(name = "masterTransactionManager")
    public DataSourceTransactionManager masterTransactionManager() throws SQLException {
        return new DataSourceTransactionManager(getMasterDataSource());
    }

    @Primary
    @Bean(name = "masterSqlSessionFactory")
    public SqlSessionFactory getMasterSqlSessionFactory(@Qualifier("masterDataSource") DataSource masterDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(masterDataSource);
        System.out.println("12" + masterDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(MasterDataSourceConfig.MAPPER_LOCATION));

        return sessionFactory.getObject();
    }

}
