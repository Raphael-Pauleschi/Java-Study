package single.main;

public class Test {

	public static void main(String[] args) {
		// SingletonLazy lazy = new SingletonLazy();
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager Eager = SingletonEager.getInstancia();
		System.out.println(Eager);
		Eager = SingletonEager.getInstancia();
		System.out.println(Eager);
		
		SingletonHolder Holder = SingletonHolder.getInstancia();
		System.out.println(Holder);
		Holder = SingletonHolder.getInstancia();
		System.out.println(Holder);
		

	}
}
