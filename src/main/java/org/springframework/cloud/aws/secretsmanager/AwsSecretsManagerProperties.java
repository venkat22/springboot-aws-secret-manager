package org.springframework.cloud.aws.secretsmanager;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
@Component
@EnableConfigurationProperties(AwsSecretsManagerProperties.class)
@ConfigurationProperties(AwsSecretsManagerProperties.CONFIG_PREFIX)
@Validated
public class AwsSecretsManagerProperties {

    /**
     * Configuration prefix.
     */
    public static final String CONFIG_PREFIX = "aws.secretsmanager";

    /**
     * Prefix indicating first level for every property. Value must start with a forward
     * slash followed by a valid path segment or be empty. Defaults to "/config".
     */
    @NotNull
    private String prefix = "/secret";

    @NotEmpty
    private String defaultContext = "application";

    @NotNull
    @Pattern(regexp = "[a-zA-Z0-9.\\-_/\\\\]+")
    private String profileSeparator = "_";

    /** Throw exceptions during config lookup if true, otherwise, log warnings. */
    private boolean failFast = true;

    /**
     * If region value is not null or empty it will be used in creation of
     * AWSSecretsManager.
     */
    private String region;

    /**
     * Alternative to spring.application.name to use in looking up values in AWS Secrets
     * Manager.
     */
    private String name;

    /** Is AWS Secrets Manager support enabled. */
    private boolean enabled = true;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getDefaultContext() {
        return defaultContext;
    }

    public void setDefaultContext(String defaultContext) {
        this.defaultContext = defaultContext;
    }

    public String getProfileSeparator() {
        return profileSeparator;
    }

    public void setProfileSeparator(String profileSeparator) {
        this.profileSeparator = profileSeparator;
    }

    public boolean isFailFast() {
        return failFast;
    }

    public void setFailFast(boolean failFast) {
        this.failFast = failFast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(final String region) {
        this.region = region;
    }

}
