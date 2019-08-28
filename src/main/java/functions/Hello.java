package functions;

import java.util.function.Function;

public class Hello implements Function<String, String> {

	public String apply(String name) {
                try {
		   Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
		return "Hello " + name;
	}
}
