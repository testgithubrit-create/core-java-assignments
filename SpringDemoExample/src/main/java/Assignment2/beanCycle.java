package Assignment2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanCycle {
  public static void main(String[] args) throws Exception {

    ConfigurableApplicationContext life = new ClassPathXmlApplicationContext("LifeCycle.xml");
    life.close();
  }

}