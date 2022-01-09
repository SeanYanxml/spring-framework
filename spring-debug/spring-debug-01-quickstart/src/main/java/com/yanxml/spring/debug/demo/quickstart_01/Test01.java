package com.yanxml.spring.debug.demo.quickstart_01;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		Teacher bean = context.getBean(Teacher.class);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getApplicationContext());
		System.out.println(bean.getBeanFactory());

		Thread.sleep(1000*10000);

		Teacher bean2 = (Teacher)  context.getBean("teacher");

		// Class 获取的三种方式.
		// Class classByMethod1 = Class.forName("com.yanxml.spring.debug.demo.first03.Teacher");
		// Object obj = (Teacher)classByMethod1.newInstance();

		// Class classByMethod2 = Teacher.class;


	}
}