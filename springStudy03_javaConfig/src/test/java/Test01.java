import com.jack.config.MyConfig;
import com.jack.pojo.Cat;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test01
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 2:28 PM
 * @Version 1.0
 **/
public class Test01 {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat.name);
    }
}
