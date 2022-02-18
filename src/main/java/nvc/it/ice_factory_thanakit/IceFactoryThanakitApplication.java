package nvc.it.ice_factory_thanakit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class IceFactoryThanakitApplication {

	public static void main(String[] args) {
		SpringApplication.run(IceFactoryThanakitApplication.class, args);
	}

}
