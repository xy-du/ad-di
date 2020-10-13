package dxy.springframework.addi.config;

import dxy.springframework.addi.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author AD
 * @date 2020/10/13
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    @Value("${dxy.username}")
    String userName;
    @Value("${dxy.password}")
    String password;
    @Value("${dxy.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        return new FakeDataSource(userName,password,url);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =new PropertySourcesPlaceholderConfigurer();
        return  propertySourcesPlaceholderConfigurer;
    }

}
