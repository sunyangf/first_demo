package sun.yang.test.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.yang.test.aop.service.UserService;
import sun.yang.test.config.AppConfig;

public class AOPMainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService= applicationContext.getBean(UserService.class);
        userService.print();
    }
}
