package single.main;

public class SingletonHolder {
	public static class InstanceHolder{
		public static SingletonHolder instancia = new SingletonHolder();
	}
	
	private SingletonHolder() {
		super();
	}
	
	public static SingletonHolder getInstancia() {
		return InstanceHolder.instancia;
	}
	
}
