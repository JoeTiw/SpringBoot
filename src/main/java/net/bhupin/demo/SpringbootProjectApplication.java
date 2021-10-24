package net.bhupin.demo;

import net.bhupin.demo.model.User;
import net.bhupin.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;



@SpringBootApplication
public class SpringbootProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}

	@Autowired  //save user object to database
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {     //run method ( executes when we deploy our application in embedded default tomcat server)
		this.userRepository.save(new User("Bhupin", "Tiwari", "bhupin@gmail.com"));
		this.userRepository.save(new User("Bhuwan", "Tiwari", "bhuwan@gmail.com"));
		this.userRepository.save(new User("Kishor", "Tiwari", "Kishor@gmail.com"));
		this.userRepository.save(new User("Dinesh", "Tiwari", "Dinesh@gmail.com"));
	}
}
