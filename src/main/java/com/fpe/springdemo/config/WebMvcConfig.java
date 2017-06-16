package com.fpe.springdemo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.fpe.springdemo.interceptors.ExecutionTimeInterceptor;
import com.fpe.springdemo.interceptors.HeaderInterceptor;

@Configuration
@ComponentScan("com.fpe.springdemo")
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
//	@Bean
//	public RequestMappingHandlerMapping requestMappingHandlerMapping(){
//		RequestMappingHandlerMapping rmhm = new RequestMappingHandlerMapping();
//		rmhm.setUseSuffixPatternMatch(true); //si lo pones a true, no importa la extensión,
//		rmhm.setUseTrailingSlashMatch(true); //es ignorada y la pagina carga si el nombre existe 
//		return rmhm;						  //ya sea .jsp , jsf , html , etc
//	}
	
	@Autowired
	private HeaderInterceptor headerInterceptor;
	@Autowired
	private ExecutionTimeInterceptor executionTimeInterceptor;
	
	@Bean
	public DataSource dataSource(){
		final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
		dsLookup.setResourceRef(true);  //nos permite referenciar el nombre corto del DataSource (name en context.xml) en caso contrario, habría q referenciar el datasource de este modo "java:comp/env/jdbc/springdb"
		DataSource dataSource = dsLookup.getDataSource("jdbc/springdb");
		return dataSource;
	}
	
	@Bean
	public UrlBasedViewResolver urlBasedViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(headerInterceptor);
		registry.addInterceptor(executionTimeInterceptor).addPathPatterns("/location");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("testMvcHome");  //redirecciona 
	}
	
}
