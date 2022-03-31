import com.jack.mapper.UserMapper;
import com.jack.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 包先铭
 * @version 1.0
 * @date 2022/3/31
 */
public class MyTest {
    @Test
    public void test() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis_config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = sessionFactory.openSession();


        UserMapper mapper = session.getMapper(UserMapper.class);
//        User user = session.selectOne("getOneUser",1);

        //UserMapper.xml中sql的id和UserMapper接口中方法名要一致，才可以绑定在一起
//        List<User> userList = mapper.selectAllUser();
//        for (User user : userList) {
//            System.out.println(user);
//        }

        User oneUser = mapper.getOneUser(3);
        System.out.println(oneUser);
    }
}
