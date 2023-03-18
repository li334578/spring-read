import bean.A;
import bean.MyClassPathXmlApplicationContext;
import bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName ApplicationMain
 * @Description TODO
 * @Author Wenbo Li
 * @Date 18/3/2023 上午 10:59
 * @Version 1.0
 */
public class ApplicationMain {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext ac2 = new MyClassPathXmlApplicationContext("beans.xml");
//		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
//		User user = (User) ac.getBean("user");
		A a = (A) ac.getBean("a");
		System.out.println(a);
	}
}
