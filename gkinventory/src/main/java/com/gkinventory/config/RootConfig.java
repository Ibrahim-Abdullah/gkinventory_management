/**
 * 
 */
package com.gkinventory.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/**
 * @author GEN-NTB-444
 *
 */

@Configuration
@ComponentScan(basePackages={"spitter"},
excludeFilters={ @Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})

public class RootConfig {

}
