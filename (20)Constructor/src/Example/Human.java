package Example;

public class Human {
	public Human(String name, String cins, int age, double height, double weight) {
		_name = name;
		_cins = cins;
		_age = age;
		_height = height;
		_weight = weight;
		
		
		
	}

	private String _name;
	private String _cins;
	private int _age;
	private double _height;
	private double _weight;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getCins() {
		return _cins;
	}

	public void setCins(String cins) {
		_cins = cins;
	}

	public int getAge() {
		return _age;
	}

	public void setAge(int age) {
		_age = age;
	}

	public double getHeight() {
		return _height;
	}

	public void setHeight(double height) {
		_height = height;
	}

	public double getWeight() {
		return _weight;
	}

	public void setWeight(double weight) {
		_weight = weight;
	}

}
