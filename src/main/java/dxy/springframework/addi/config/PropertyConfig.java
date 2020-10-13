package dxy.springframework.addi.config;

import dxy.springframework.addi.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author AD
 * @date 2020/10/13
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    @Autowired
    Environment env;

    @Value("${dxy.username}")
    String userName;
    @Value("${dxy.password}")
    String password;
    @Value("${dxy.dburl}")
    String url;

    /**
     * if the environment property name is DXY_USERNAME, it will overwrite the property set here
     * if the env property name is, say, USERNAME, then you have to get it specifically and manually using
     * env.getProperty("propertyName")
     * @return
     */
    @Bean
    public FakeDataSource fakeDataSource(){
        String env_username=env.getProperty("USERNAME");
        return new FakeDataSource(env_username,password,url);
//        return new FakeDataSource(userName,password,url);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =new PropertySourcesPlaceholderConfigurer();
        return  propertySourcesPlaceholderConfigurer;
    }

}
