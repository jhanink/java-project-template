package helloWorld;

import static org.junit.Assert.*;

import com.salesforce.interview.HelloWorld;
import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void testHelloWorld(){
		HelloWorld hello = new HelloWorld();
		assertEquals("A test for Hello World String", "Hello World", hello.sayHello());
	}
}
