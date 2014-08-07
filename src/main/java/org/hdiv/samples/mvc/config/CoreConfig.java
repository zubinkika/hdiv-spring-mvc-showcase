package org.hdiv.samples.mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "/WEB-INF/dataAccess-config.xml" })
public class CoreConfig {

}
