package factoryMethod;

public class NaturalNumberFactory {

	NaturalNumberCreator creator;
	
	public NaturalNumberFactory() {
		this.creator = new NaturalNumberCreatorES();
	}

	public void setCreator(NaturalNumberCreator c) {
		this.creator = c;
	}

	public NaturalNumber getNumber(int i) {
		return this.creator.createNumber(i);
	}
}
