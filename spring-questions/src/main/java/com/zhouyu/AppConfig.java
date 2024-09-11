package com.zhouyu;

import com.zhouyu.service.OrderService;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： li
 * @date： 2024/9/10 21:19
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
//@EnableAspectJAutoProxy
@ComponentScan("com.zhouyu")
@EnableTransactionManagement//启动事务
public class AppConfig {
    //    @Bean
//    public OrderService orderService1(){
//        return new OrderService();
//    }
    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }
    @Bean
    public PlatformTransactionManager transactionManager(){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }
    @Bean(autowire = Autowire.BY_TYPE)
    public OrderService orderService() {
        return new OrderService();
    }


    @Bean
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/jdbctest?useUnicode=true&characterEncoding=UTF-8&useSSL=false" );
        ds.setUsername("root");
        ds.setPassword("123456");
        return ds;
    }
}
