import com.jack.dao.UserDao;
import com.jack.dao.UserDaoMySqlImpl;
import com.jack.dao.UserDaoOracleImpl;
import com.jack.service.UserService;
import com.jack.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test00
 * @Description Jack
 * @Author jack.bao
 * @Date 3/28/2022 4:22 PM
 * @Version 1.0
 **/
public class Test00 {
    @Test
    public void test() {
//        UserService service = new UserServiceImpl();
//        service.getUser();

        //
//        UserServiceImpl service = new UserServiceImpl();
//        service.setUserDao( new UserDaoMySqlImpl() );
//        service.getUser();
////那我们现在又想用Oracle去实现呢
//        service.setUserDao( new UserDaoOracleImpl() );
//        service.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("sqlBean.xml");
        UserServiceImpl serviceImpl = context.getBean("ServiceImpl", UserServiceImpl.class);
        serviceImpl.getUser();

//        ApplicationContext context = new
//                ClassPathXmlApplicationContext("sqlBean.xml");
//        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
//        serviceImpl.getUser();
    }
}
