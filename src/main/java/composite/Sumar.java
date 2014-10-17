package composite;

public class Sumar extends Operacion {

	public Sumar(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
}

	@Override
	public int operar() {
		return this.getExp1().operar()+this.getExp2().operar();
	}
	
	public String toString(){
		return "(" + this.getExp1().toString() + "+" + this.getExp2().toString() + ")";
	}

}
