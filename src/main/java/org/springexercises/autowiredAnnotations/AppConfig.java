package org.springexercises.autowiredAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.springexercises.autowiredAnnotations")
public class AppConfig {
}
