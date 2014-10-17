package composite;

public class Numero extends Expresion {

	private int i;
	
	public Numero(int i) {
		this.setI(i);
	}

	public float getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public int operar() {
		return i;
	}
	
	public String toString(){
		return Integer.toString(i);
	}

}
