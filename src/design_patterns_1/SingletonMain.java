package design_patterns_1;
//demonstrating singleton design pattern in java
class Singleton{
	int age = 89;
	private static Singleton inst = null;
	private Singleton() {
		
	}
	
	@Override
	public String toString() {
		return "Singleton [age=" + age + "]";
	}

	public static Singleton getInst() {
		if(inst==null) {
			inst = new Singleton();
		}
		return inst;
	}
}

public class SingletonMain {

	public static void main(String[] args) {
		Singleton singletonObj = Singleton.getInst();
		System.out.println(singletonObj);

	}

}
