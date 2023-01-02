package Assignment5;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class initializeDispose implements InitializingBean, DisposableBean {
  public void doSomething() {

    System.out.println("initializeDispose.doSomething");
  }

  public void destroy() throws Exception {

    // TODO Auto-generated method stub
    System.out.println("initializeDispose.destroy");

  }

  public void afterPropertiesSet() throws Exception {

    // TODO Auto-generated method stub
    System.out.println("initializeDispose.afterPropertiesSet");

  }
}
