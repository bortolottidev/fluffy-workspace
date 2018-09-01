package Package;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawClass {

    public static void main(String[] args) throws BeansException {
        BeanFactory factory = new XmlBeanFactory(
                new FileSystemResource(
                    "spring.xml" ) ) ;
        Triangle triangle = (Triangle) factory.getBean("triangle") ;
        triangle.draw() ;
    }


}
