import com.jack.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test01
 * @Description Jack
 * @Author jack.bao
 * @Date 3/28/2022 4:10 PM
 * @Version 1.0
 **/
public class Test01 {
    @Test
    public void test() {
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("helloBean.xml");
        //getBean : 参数即为spring配置文件中bean的id .
        Hello hello = context.getBean("hello", Hello.class);
        hello.show();
    }
}
