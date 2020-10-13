package dxy.springframework.addi;

import dxy.springframework.addi.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author AD
 */
@SpringBootApplication
public class AdDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AdDiApplication.class, args);

        FakeDataSource fakeDataSource=ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUserName());
    }

}
