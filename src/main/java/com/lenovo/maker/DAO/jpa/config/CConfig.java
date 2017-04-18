//package com.lenovo.maker.DAO.jpa.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories(entityManagerFactoryRef = "dataEntityManagerFactory", transactionManagerRef = "dataTransactionManager", basePackages = {
//        "com.lenovo.maker.DAO.jpa" })
//public class CConfig extends BaseConfig {
//
//
//
//    @Primary
//    @Bean
//    public DataSource cDataSource() {
//        return getDataSource();
//    }
//
//    @Primary
//    @Bean(name =  SUFFIX_DATA_ENTITY_MANAGER_FACTORY)
//    @Override
//    public LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory() {
//        return super.mysqlEntityManagerFactory();
//    }
//
//    @Primary
//    @Bean(name = SUFFIX_DATA_TRANSACTION_MANAGER)
//    @Override
//    public PlatformTransactionManager transactionManager() {
//        return super.transactionManager();
//    }
//}