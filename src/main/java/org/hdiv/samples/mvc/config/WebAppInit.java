package org.hdiv.samples.mvc.config;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.hdiv.filter.ValidatorFilter;
import org.hdiv.listener.InitListener;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.DelegatingFilterProxy;

public class WebAppInit implements WebApplicationInitializer {

	public void onStartup(ServletContext container) throws ServletException {

		container.addFilter("ValidatorFilter", ValidatorFilter.class).
			addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), false, "/*");

		container.addListener(new InitListener());

		container.addFilter("springSecurityFilterChain", DelegatingFilterProxy.class).
			addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), false, "/*");
	}
}