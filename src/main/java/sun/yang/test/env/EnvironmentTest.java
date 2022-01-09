package sun.yang.test.env;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 取地址符
 */
public class EnvironmentTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object bean = classPathXmlApplicationContext.getBean("&userBean");
        System.out.println(bean);
    }
}
