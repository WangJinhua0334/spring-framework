package org.springframework;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User)context.getBean("user");
		System.out.println(user.toString());
	}
}
