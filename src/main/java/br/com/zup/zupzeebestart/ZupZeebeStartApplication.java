package br.com.zup.zupzeebestart;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import io.camunda.zeebe.spring.client.annotation.ZeebeDeployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableZeebeClient
@EnableAutoConfiguration
@EntityScan(basePackages = "br.com.zup.zupzeebestart.domain")
@ZeebeDeployment(resources = "classpath:bpmns/*.bpmn")
public class ZupZeebeStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZupZeebeStartApplication.class, args);
	}

}
