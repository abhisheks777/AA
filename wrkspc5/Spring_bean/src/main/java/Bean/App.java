package Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class App {
	@RequestMapping(value="/hell",method=RequestMethod.GET)
public @ResponseBody String AppMain() throws Exception
{
	ApplicationContext fact=new AnnotationConfigApplicationContext(AppConfig.class);
	Samsung s1=fact.getBean(Samsung.class);
	 s1.config();
	 return "bean";
	}
}
