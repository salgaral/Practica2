package factoryMethod;

public class NaturalNumberCreatorES extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNumber(int i) {
		return new NaturalNumberEs(i);
	}

}