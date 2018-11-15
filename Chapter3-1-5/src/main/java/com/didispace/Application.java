package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

	public void test(){
		System.out.println("修改文件了");
	}

	public void testDav(){
		System.out.println("测试分支");
	}

	public void testAbc(){
		System.out.println("sss");
	}
}
