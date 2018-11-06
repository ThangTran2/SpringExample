package com.tutorialspoint;

//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//
//	      objA.setMessage("I'm object A");
//	      objA.getMessage();
//
//	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//	      //objB.setMessage("I'm object B");
//	      objB.getMessage();

//		Spring - Bean Life Cycle
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//		obj.getMessage();
//		HelloWorld obj2 = (HelloWorld) context.getBean("tryTest");
//		obj2.setMessage("I'm object 2");
//		obj2.getMessage();
//		context.registerShutdownHook();

		// Spring - Bean Post Processors
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//
//		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//		obj.getMessage();
//		context.registerShutdownHook();

		// Spring - Bean Definition Inheritance
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//		objA.getMessage1();
//		objA.getMessage2();

//		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
//		objB.getMessage1();
//		objB.getMessage2();
//		objB.getMessage3();

//		Spring - Dependency Injection là 1 phương pháp lập trình

//		Constructor-based Dependency Injection
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//
//		TextEditor te = (TextEditor) context.getBean("textEditor");
//		te.spellCheck();

//		Spring - Injecting Inner Beans
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		TextEditor te = (TextEditor) context.getBean("textEditor");
//		te.spellCheck();
//		te.getMessage();

//		Spring - Injecting Collection
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
//
//		jc.getAddressList();
//		jc.getAddressSet();
//		jc.getAddressMap();
//		jc.getAddressProp();

//		Event Handling in Spring	
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//
//		// Let us raise a start event.
//		context.start();
//
//		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//		obj.getMessage();
//
//		// Let us raise a stop event.
//		context.stop();

		
//		Custom Events in Spring
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");

		cvp.publish();
		cvp.publish();
	}

}
