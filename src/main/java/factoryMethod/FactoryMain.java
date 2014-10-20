package factoryMethod;

public class FactoryMain {

	public static void main(String[] args) {
		NaturalNumberFactory f = new NaturalNumberFactory();
		f.setCreator(new NaturalNumberCreatorEN());
		NaturalNumber n1 = f.getNumber(1);
		System.out.println("El numero 1 se dice: " + n1.getTextValue());
	}

}
