package first.boot.firstboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloWorldService {

	@RequestMapping("/hello")
	public String helloWorld() {

		return "Hello World";
	}
}
