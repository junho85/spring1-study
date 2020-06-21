import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("== afterPropertiesSet ==");
    }

    public void hello() {
        System.out.println("hello");
    }
}
