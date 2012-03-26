package fr.gipmds.arpej.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;

/**
 * Web application Java configuration class. 
 * This usage of web application initializer 
 * requires Spring Framework 3.1 and Servlet 3.0.
 * no need for web.xml
 * @author itamayo
 */
public class SpringJPAWebInitializer implements WebApplicationInitializer {
    
	private static final String DISPATCHER_SERVLET_NAME = "dispatcher";
    private static final String DISPATCHER_SERVLET_MAPPING = "/";
    
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(AppContext.class);
        
     // Secures the application
        servletContext.addFilter("springSecurityFilterChain",new DelegatingFilterProxy())
        .addMappingForUrlPatterns(null,false,"/*");
        
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(rootContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping(DISPATCHER_SERVLET_MAPPING);

        servletContext.addListener(new ContextLoaderListener(rootContext));
    }
}