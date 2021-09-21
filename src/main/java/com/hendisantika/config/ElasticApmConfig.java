package com.hendisantika.config;

import lombok.Setter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elastic-apm-integration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/09/21
 * Time: 08.03
 */
@Setter
@Configuration
@ConfigurationProperties(prefix = "elastic.apm")
@ConditionalOnProperty(value = "elastic.apm.enabled", havingValue = "true")
public class ElasticApmConfig {

    private static final String SERVER_URL_KEY = "server_url";
    private static final String SERVICE_NAME_KEY = "service_name";
    private static final String SECRET_TOKEN_KEY = "secret_token";
    private static final String ENVIRONMENT_KEY = "environment";
    private static final String APPLICATION_PACKAGES_KEY = "application_packages";
    private static final String LOG_LEVEL_KEY = "log_level";
    private String serverUrl;
    private String serviceName;
    private String secretToken;
    private String environment;
    private String applicationPackages;
    private String logLevel;
}
