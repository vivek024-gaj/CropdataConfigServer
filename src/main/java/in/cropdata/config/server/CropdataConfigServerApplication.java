package in.cropdata.config.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CropdataConfigServerApplication {

	@Value("${app.greet.name}")
	private static String test;
	
	public static void main(String[] args) {
		SpringApplication.run(CropdataConfigServerApplication.class, args);
		System.out.println("test>>>>>>>>>>>>>>>" + test);
	}

}
