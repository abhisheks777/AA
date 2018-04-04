package Bean_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ctrlr {
@RequestMapping(value="map",method=RequestMethod.GET)
public @ResponseBody void ret()
{
	ApplicationContext cntext=new ClassPathXmlApplicationContext("spring/application-config.xml");
	A a=cntext.getBean("a",A.class);
	a.display();
	((AbstractApplicationContext) cntext).registerShutdownHook();}
}
