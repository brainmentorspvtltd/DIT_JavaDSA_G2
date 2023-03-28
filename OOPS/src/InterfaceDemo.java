interface IPlayer {
//	void walk();		// internally - public abstract void walk();
//	void run();
//	void jump();
	void kick();
	void punch();
	int JUMP_HEIGHT = 100;	// internally - public static final int JUMP_HEIGHT
	static void walk() {
		
	}
	default void run() {
		
	}
	
}

//abstract class CommonUtils implements IPlayer {
//	@Override
//	public void walk() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void jump() {
//		// TODO Auto-generated method stub
//		
//	}
//}

class King implements IPlayer {


	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}
	
}

class Paul implements IPlayer {

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
