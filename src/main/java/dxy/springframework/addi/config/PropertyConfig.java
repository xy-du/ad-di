package dxy.springframework.addi.config;

import dxy.springframework.addi.examplebeans.FakeDataSource;
import dxy.springframework.addi.examplebeans.FakeJMSSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author AD
 * @date 2020/10/13
 */
@Configuration
public class PropertyConfig {
    @Autowired
    Environment env;

    @Value("${dxy.username}")
    String userName;
    @Value("${dxy.password}")
    String password;
    @Value("${dxy.dburl}")
    String url;

    @Value("${dxy.jms.username}")
    String jmsUserName;
    @Value("${dxy.jms.password}")
    String jmsPassword;
    @Value("${dxy.jms.dburl}")
    String jmsUrl;

    /**
     * if the environment property name is DXY_USERNAME, it will overwrite the property set here
     * if the env property name is, say, USERNAME, then you have to get it specifically and manually using
     * env.getProperty("propertyName")
     * @return
     */
    @Bean
    public FakeDataSource fakeDataSource(){
        return new FakeDataSource(userName,password,url);
    }

    @Bean
    public FakeJMSSource fakeJmsDataSource(){
        return new FakeJMSSource(jmsUserName,jmsPassword,jmsUrl);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =new PropertySourcesPlaceholderConfigurer();
        return  propertySourcesPlaceholderConfigurer;
    }

}
