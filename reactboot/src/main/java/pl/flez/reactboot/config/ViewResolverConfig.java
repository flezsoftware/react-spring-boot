package pl.flez.reactboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.result.view.UrlBasedViewResolver;
import org.springframework.web.reactive.result.view.ViewResolver;
import org.springframework.web.reactive.result.view.freemarker.FreeMarkerViewResolver;
import org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer;
import org.springframework.web.reactive.result.view.script.ScriptTemplateViewResolver;



@Configuration
public class ViewResolverConfig  {

//	@Bean
//	public ScriptTemplateConfigurer handlebarsConfigurer() {
//	ScriptTemplateConfigurer configurer = new ScriptTemplateConfigurer();
//		configurer.setEngineName("nashorn");		
// 		configurer.setScripts(  "static/js/ejs.min.js", "/META-INF/resources/webjars/jquery/3.4.1/jquery.min.js", "/META-INF/resources/webjars/react/16.5.2/umd/react.production.min.js", "/META-INF/resources/webjars/react-dom/16.5.2/umd/react-dom.development.js", "/META-INF/resources/webjars/babel-standalone/6.26.0/babel.min.js" ,"/static/render.js");
//		configurer.setRenderFunction("render");
//		configurer.setSharedEngine(false);
//		return configurer;
//	}
	
//	@Bean
//	public ViewResolver viewResolver() {
//		
//		UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
//		FreeMarkerViewResolver
//	//	ScriptTemplateViewResolver viewResolver = new ScriptTemplateViewResolver();
//		viewResolver.setPrefix("/static/templates/");
//		viewResolver.setSuffix(".html");
//		viewResolver.setViewClass();
//		return viewResolver;
//	}
	
}
