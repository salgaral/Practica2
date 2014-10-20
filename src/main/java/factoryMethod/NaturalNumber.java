package factoryMethod;

public abstract class NaturalNumber {
	
	protected int value;
	
	public NaturalNumber(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

    public void add(int value) {
        this.setValue(this.value + value);
    }

    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }
    
	public abstract String getTextValue();	
}
