import com.jack.pojo.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserTest
 * @Description Jack
 * @Author jack.bao
 * @Date 3/28/2022 5:14 PM
 * @Version 1.0
 **/
public class UserTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");
        UserT usert = context.getBean("usert", UserT.class);
        usert.show();
    }
}
