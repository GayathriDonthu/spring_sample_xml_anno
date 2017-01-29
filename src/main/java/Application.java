import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.CustomerService;


public class Application {

	public static void main(String[] args) {
		
		//CustomerService service = new CustomerServiceImpl();
		AbstractApplicationContext appContext = null;
		try{
			appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			CustomerService service = appContext.getBean("customerService", CustomerService.class);
			
			System.out.println(service.findAll().get(0).getFirstName());
		} finally{
			if(null != appContext){
				appContext.close();
			}
		}
		
	}

}
