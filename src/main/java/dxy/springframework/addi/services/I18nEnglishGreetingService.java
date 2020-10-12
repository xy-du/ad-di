package dxy.springframework.addi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author AD
 * @date 2020/10/08
 */

//@Profile({"EN","default"})
@Profile({"ed","default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
