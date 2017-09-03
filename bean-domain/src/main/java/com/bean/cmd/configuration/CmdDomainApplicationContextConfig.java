package com.bean.cmd.configuration;

import org.springframework.context.annotation.Configuration;

import com.bean.cmd.domain.Domains;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.AbstractEnvironment;

/**
 * Created by hoons on 2015-10-21.
 */
@Configuration
@ComponentScan(basePackageClasses = Domains.class)
@PropertySource({ "classpath:domain-${" + AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME + "}.properties" })
//@EnableJpaRepositories(basePackages = "com.bean.appting.repository")
public class CmdDomainApplicationContextConfig {
}
