package pe.edu.cibertec.app_eureka_server_t2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppEurekaServerT2Application {

	public static void main(String[] args) {
		SpringApplication.run(AppEurekaServerT2Application.class, args);
	}

}
