package de.szut.ProjectZer0.config;


import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "de.szut.ProjectZer0")
public class AppConfig extends WebMvcConfigurerAdapter {
	   @Bean
	    public UrlBasedViewResolver setupViewResolver() {  
	        UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
	        resolver.setPrefix("/WEB-INF/jsp/");  
	        resolver.setSuffix(".jsp");  
	        resolver.setViewClass(JstlView.class);  
	        return resolver;  
	    }
	   @Bean
	    public MessageSource messageSource() {
	        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	        messageSource.setBasename("messages");
	        return messageSource;
	    }
	   @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    	  registry.addResourceHandler("/static/**").addResourceLocations("/WEB-INF/static/");
	    }
	   

}
