package factoryMethod;

public class NaturalNumberCreatorEN extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNumber(int i) {
		return new NaturalNumberEn(i);
	}

}