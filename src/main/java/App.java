import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanT =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanT.getMessage());
        System.out.println("пары бинов ссылаются на один объект?" + (beanT == bean));

        Cat firstCat = (Cat) applicationContext.getBean("cat");
        System.out.println(firstCat.getMessage());
        Cat secondCat = (Cat) applicationContext.getBean("cat");
        System.out.println(secondCat.getMessage());
        System.out.println("пары бинов ссылаются на один объект?" + (firstCat == secondCat));

    }
}