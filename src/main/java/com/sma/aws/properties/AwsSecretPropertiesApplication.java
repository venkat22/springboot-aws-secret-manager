package com.sma.aws.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.Validator;


@SpringBootApplication() // avoid an exception when running at local
public class AwsSecretPropertiesApplication {
    public static void main(String[] args) {
        SpringApplication.run(AwsSecretPropertiesApplication.class, args);
    }

}

