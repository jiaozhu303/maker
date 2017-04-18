//package com.lenovo.maker.DAO.jpa.config;
//
//import org.hibernate.jpa.HibernatePersistenceProvider;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.orm.hibernate4.HibernateExceptionTranslator;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.annotation.PreDestroy;
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//@EnableTransactionManagement
//@PropertySource("classpath:application.properties")
//public abstract class BaseConfig {
//    private static final String HIBERNATE_DIALECT = "hibernate.dialect";
//    private static final String HIBERNATE_SHOW_SQL = "hibernate.show_sql";
//    private static final String HIBERNATE_DDL = "hibernate.hbm2ddl.auto";
//    private static final String HIBERNATE_INTERCEPTOR = "hibernate.ejb.interceptor";
//
//    private static final String DATABASE_DRIVER = "spring.datasource.driver-class-name";
//    private static final String DATABASE_URL = "spring.datasource.url";
//    private static final String DATABASE_USER = "spring.datasource.username";
//    private static final String DATABASE_CIPHER = "spring.datasource.password";
//    private static final String DATABASE_MAXIMUM_POOL_SIZE = "data.db.maximumPoolSize";
//    private static final String DATABASE_MINIMUM_IDLE = "data.db.minimumIdle";
//    private static final String DATABASE_CONNECTION_TIMEOUT = "data.db.connectionTimeout";
//    private static final String PACKAGES_TO_SCAN = "data.packages.to.scan";
//
//    protected static final String SUFFIX_DATA_ENTITY_MANAGER_FACTORY = "dataEntityManagerFactory";
//    protected static final String SUFFIX_DATA_TRANSACTION_MANAGER = "dataTransactionManager";
//
//    @Autowired
//    private Environment env;
//
//    private org.apache.tomcat.jdbc.pool.DataSource dataSource;
//
//    @PreDestroy
//    public void destroy() {
//        if (dataSource != null) {
//            dataSource.close(true);
//        }
//    }
//
//    @Bean
//    public HibernateExceptionTranslator hibernateExceptionTranslator() {
//        return new HibernateExceptionTranslator();
//    }
//
//
//
//    protected DataSource getDataSource() {
//        if (dataSource == null) {
//            dataSource = new org.apache.tomcat.jdbc.pool.DataSource();
//            dataSource.setDriverClassName(env.getRequiredProperty(  DATABASE_DRIVER));
//            dataSource.setUrl(env.getRequiredProperty( DATABASE_URL));
//            dataSource.setUsername(env.getRequiredProperty(DATABASE_USER));
//            dataSource.setPassword(env.getRequiredProperty(DATABASE_CIPHER));
//            dataSource.setValidationQuery("SELECT 1");
//            dataSource.setTestOnBorrow(true);
//            dataSource
//                    .setMaxActive(Integer.parseInt(env.getRequiredProperty( DATABASE_MAXIMUM_POOL_SIZE)));
//            dataSource.setMinIdle(Integer.parseInt(env.getRequiredProperty( DATABASE_MINIMUM_IDLE)));
//            dataSource.setLoginTimeout(
//                    Integer.parseInt(env.getRequiredProperty( DATABASE_CONNECTION_TIMEOUT)));
//        }
//
//        return dataSource;
//    }
//
//    protected LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setDataSource(getDataSource());
//        factory.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//        factory.setPackagesToScan(env.getRequiredProperty(PACKAGES_TO_SCAN).split(","));
//        factory.setJpaDialect(new HibernateJpaDialect());
//        factory.setJpaProperties(hibernateProperties());
//        factory.afterPropertiesSet();
//        return factory;
//    }
//
//    protected PlatformTransactionManager transactionManager() {
//        JpaTransactionManager manager = new JpaTransactionManager();
//        manager.setEntityManagerFactory(mysqlEntityManagerFactory().getObject());
//        return manager;
//    }
//
//    private Properties hibernateProperties() {
//        Properties properties = new Properties();
//        properties.put(HIBERNATE_DIALECT, env.getRequiredProperty(HIBERNATE_DIALECT));
//        properties.put(HIBERNATE_SHOW_SQL, env.getRequiredProperty(HIBERNATE_SHOW_SQL));
//        properties.put(HIBERNATE_DDL, env.getRequiredProperty(HIBERNATE_DDL));
//
//        return properties;
//    }
//}