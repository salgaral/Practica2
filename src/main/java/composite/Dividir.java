package composite;

public class Dividir extends Operacion {

	public Dividir(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
	}
	
	public int operar(){
		return this.getExp1().operar()/this.getExp2().operar();
	}
	
	public String toString(){
		return "(" + this.getExp1().toString() + "/" + this.getExp2().toString() + ")";
	}

}
