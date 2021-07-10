package practice.lambda;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);

		greeter.greet(new Greeting() {

			@Override
			public void perform() {
				System.out.println("Hello Danish...");
			}
		});

		Greeting myLambda = () -> System.out.println("Hello Lambda...");
		myLambda.perform();

	}
}

@FunctionalInterface
interface MyLambda {
	void foo();
}