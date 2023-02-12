package nri.fintech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student st=(Student) context.getBean("studentproxy","studentproxy1");
		Student er=(Student) context.getBean("studentproxy1");
		System.out.println("------------");
		st.avgmarks();
		System.out.println("------------");
		er.showMarks();
		System.out.println("------------");
		
	}

}
