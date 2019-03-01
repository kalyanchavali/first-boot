package first.boot.firstboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloWorldService {
	static List<Integer> intList = new ArrayList<Integer>();

	@RequestMapping("/hello")
	public String helloWorld() {
		System.out.println("Invoked Hello world service");
		madLoop();
		return "Hello World";
	}

	private static void madLoop() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			intList.add(i);
		}
	}
}
