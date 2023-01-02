package Assignment5;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class initDisposedemo {
  public static void main(String[] args) {

    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("init-dispose.xml");
    initializeDispose initdispose = (initializeDispose) context.getBean("initdisposes");

    initdispose.doSomething();
  }

}
