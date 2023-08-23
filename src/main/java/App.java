import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class App {
    private static final Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        log.info(bean.getMessage());
                HelloWorld beanT =
                (HelloWorld) applicationContext.getBean("helloworld");
        log.info(beanT.getMessage());
        String msg = "пары бинов ссылаются на один объект?";
        log.info(msg + (beanT == bean));
        Cat firstCat = (Cat) applicationContext.getBean("cat");
        log.info(firstCat.getMessage());
        Cat secondCat = (Cat) applicationContext.getBean("cat");
        log.info(secondCat.getMessage());
        log.info(msg + (firstCat == secondCat));

    }
}