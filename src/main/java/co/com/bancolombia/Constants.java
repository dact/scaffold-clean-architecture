package co.com.bancolombia;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {
  public static final String PLUGIN_TASK_GROUP = "Clean Architecture";
  public static final String SECRETS_VERSION = "3.0.0";
  public static final String SPRING_BOOT_VERSION = "2.6.2";
  public static final String UNDERTOW_VERSION = "2.6.2";
  public static final String JETTY_VERSION = "2.6.2";
  public static final String SONAR_VERSION = "3.0";
  public static final String LOMBOK_VERSION = "1.18.22";
  public static final String JACOCO_VERSION = "0.8.5";
  public static final String COBERTURA_VERSION = "3.0.0";
  public static final String RCOMMONS_ASYNC_COMMONS_STARTER_VERSION = "1.0.3";
  public static final String RCOMMONS_OBJECT_MAPPER_VERSION = "0.1.0";
  public static final String PLUGIN_VERSION = "2.2.3";
  public static final String GRADLE_WRAPPER_VERSION = "6.9.1";
  public static final String KOTLIN_VERSION = "1.6.10";
  public static final String TOMCAT_EXCLUSION_KOTLIN =
      "configurations {\n"
          + "\tall {\n"
          + "\t\texclude(group = \"org.springframework.boot\", module = \"spring-boot-starter-tomcat\")\n"
          + "\t}\n"
          + "}";
  public static final String TOMCAT_EXCLUSION =
      "compile.exclude group: \"org.springframework.boot\", module:\"spring-boot-starter-tomcat\"";
  public static final String COMMONS_JMS_VERSION = "0.1.2";

  public enum BooleanOption {
    TRUE,
    FALSE
  }
}
