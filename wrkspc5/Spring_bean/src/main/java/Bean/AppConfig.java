package Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;


@Configuration

@ComponentScan(basePackages="Bean")
public class AppConfig {
	/*@Bean
	public InternalResourceViewResolver viewResolver()
	{
		System.out.println("\n\n\nello hello hello");
	    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	    viewResolver.setViewClass(JstlView.class);
	    viewResolver.setPrefix("/WEB-INF/pages/");
	    viewResolver.setSuffix(".jsp");
	    return viewResolver;
	}*/
	@Bean
	public Samsung getPhone()
	{return new Samsung();}
	@Bean
	public MobileProcessor getProcess()
	{
		return new Snapdragon();
	}
}
