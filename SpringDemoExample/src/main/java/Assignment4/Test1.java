package Assignment4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test1 {
  public static void main(String args[]) {

    Resource r = new ClassPathResource("solution.xml");
    BeanFactory factory = new XmlBeanFactory(r);
    Question q = (Question) factory.getBean("questionid");
    q.display();
  }

}
