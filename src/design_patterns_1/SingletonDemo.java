package design_patterns_1;
																																																											
class RegularClass{
	int age = 18;
	@Override
	public String toString() {
		return "RegularClass [age=" + age + "]";
	}
}

class SingletonClass{
	int age = 90;
	private static SingletonClass instance = null;//static method cannot call static methods
	
	private SingletonClass() {
	}
	@Override
	public String toString() {
		return "Singleton [age=" + age + "]";
	}
	public static SingletonClass getInstance() {
		if(instance==null) {		//no active object
			instance=new SingletonClass();
		}
		
		return instance;//returns an object of the class
	}
	
}
public class SingletonDemo {

	public static void main(String[] args) {
		System.out.println("Demonstrating RegularClass ");
		RegularClass regularObj1 = new RegularClass();
		RegularClass regularObj2 = new RegularClass();
		System.out.println("Address of regularObj1: " +regularObj1.hashCode());
		System.out.println("Address of regularObj1: " +regularObj2.hashCode());
		
		regularObj1.age=30;
		System.out.println(regularObj1);
		System.out.println(regularObj2);
		
		System.out.println("Demonstrating SingletonClass ");
		
		SingletonClass singletonObj1 = SingletonClass.getInstance();
		SingletonClass singletonObj2 = SingletonClass.getInstance();
		System.out.println("Address of singletonObj1: " +singletonObj1.hashCode());
		System.out.println("Address of singletonObj2: " +singletonObj2.hashCode());
		singletonObj1.age = 45;
		System.out.println(singletonObj1);
		System.out.println(singletonObj2);
		

	}

}
