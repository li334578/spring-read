package bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyClassPathXmlApplicationContext
 * @Description TODO
 * @Author Wenbo Li
 * @Date 18/3/2023 下午 3:32
 * @Version 1.0
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展 initPropertySources");
//		getEnvironment().setRequiredProperties("abc");
	}
}
