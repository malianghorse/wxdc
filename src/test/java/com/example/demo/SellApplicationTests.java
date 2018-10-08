package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellApplicationTests {
//	private final Logger logger= LoggerFactory.getLogger(SellApplicationTests.class);
	@Test
	public void contextLoads() {
//		logger.info("info...");
//
//		logger.debug("debugger..");
//
//		logger.error("error...");
//		log.info("info...");
//		log.error("error...");
//		log.debug("debugger...");
//		log.warn("warn...");
//		log.trace("trace..");
//
//		String name="nick";
//		String passWord="123";
//		log.info("name:{},password:{}",name,passWord);
		try {

			Class<?> aClass = Class.forName("com.example.demo.class1");
			Class<?> aClass1 = aClass.getClassLoader().loadClass("com.example.demo.class2");
//			aClass1.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {

			Class<?> aClass = Class.forName("com.example.demo.class1");
			Class<?> aClass1 = aClass.getClassLoader().loadClass("com.example.demo.class2");
//			aClass1.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


class class1{
	static {
		System.out.println("class1");
	}
}


class clsss2{
	static {
		System.out.println("class2");
	}
}