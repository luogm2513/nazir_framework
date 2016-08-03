package nazir_framework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
@Component("dataSourece")
public class Test {
    @Value("${jndi.name}")
    private static String host;

    public static void main(String[] args) {
        // WebApplicationContext context =
        // ContextLoader.getCurrentWebApplicationContext();
        try {
            System.out.println(host);
            // DataSource dataSource=(DataSource)
            // context.getBean("propertyConfigurer");
            // System.out.println(dataSource.getConnection());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
