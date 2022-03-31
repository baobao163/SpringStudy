import com.jack.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test01 : Bean自动装配
 * @Description Jack
 * @Author jack.bao
 * @Date 3/28/2022 5:51 PM
 * @Version 1.0
 **/
public class Test01 {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.getCat());
        System.out.println(user.getDog());
        System.out.println(user.getStr());
    }
}
