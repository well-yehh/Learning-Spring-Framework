package Dear.darling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //help to make container for storing objects
        Alien a = context.getBean(Alien.class);
//        a.setAge(32);
//        System.out.println(a.getAge());
        a.build();
    }
}
