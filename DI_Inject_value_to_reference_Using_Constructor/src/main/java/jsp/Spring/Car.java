package jsp.Spring;

public class Car {
	private Engine engine;
	
	Car(Engine engine){
		this.engine = engine;
	}
	public void start() {
		System.out.println("Car is starting");
		engine.run();
	}
}
