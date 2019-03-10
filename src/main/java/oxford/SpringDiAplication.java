package oxford;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiAplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    }
}
