import com.jack.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test02
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 11:27 AM
 * @Version 1.0
 **/
public class Test02 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student1 = context.getBean("student", Student.class);
        Student student2 = context.getBean("student", Student.class);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1);
        System.out.println(student2);

    }
}
