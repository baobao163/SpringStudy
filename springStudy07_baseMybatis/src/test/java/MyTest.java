import com.jack.mapper.UserMapper;
import com.jack.model.User;
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
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = sessionFactory.openSession();

//        String statement = "com.jack.mapper.UserMapper.selectAllUser";
//        List<User> userList = session.selectList(statement);
//        System.out.println(userList);
//        session.close();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }

//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new
//                SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.selectUser();
//        for (User user : userList) {
//            System.out.println(user);
//        }
//        sqlSession.close();
    }
}
