import com.jack.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 6:33 PM
 * @Version 1.0
 **/
public class MyTest {
    @Test
    //第一种方式：使用sping api实现
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");
        //代理的是一类接口
        UserService userService = (UserService) context.getBean("userServiceImpl");
        userService.add();
    }

    @Test
    //第二种方式：使用自定义方式
    public void test2(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans02.xml");
        UserService userService = (UserService)
                context.getBean("userService");
        userService.add();
    }

    @Test
    //第三种方式：使用注解实现
    public void test3(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans03.xml");
        UserService userService = (UserService)
                context.getBean("userService");
        userService.add();
    }
}
