import com.jack.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 包先铭
 * @version 1.0
 * @date 2022/3/31
 */
public class SpringMybatisTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        System.out.println(userMapper.getOneUser(1));
        System.out.println("***********");
        userMapper.selectAllUser().forEach(System.out::println);
    }
}
