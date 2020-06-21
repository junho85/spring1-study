import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Hello hello = (Hello)ctx.getBean("hello");
        hello.hello();
    }
}
