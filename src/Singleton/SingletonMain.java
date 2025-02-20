package Singleton;

public class SingletonMain {
	public static void main(String[] args) {
		SingletonClass singleton1 = SingletonClass.getInstance();
		SingletonClass singleton2 = SingletonClass.getInstance();
		System.out.println(singleton1==singleton2);
	}
}
