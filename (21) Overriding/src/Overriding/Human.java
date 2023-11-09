package Overriding;


public class Human {
	private String Name,Gender;
	private int Age;
	private double Height,Weight;
	

	public Human(String name, String gender, int age, double height, double weight) {
		Name=name;
		Gender=gender;
		Age=age;
		Height=height;
		Weight=weight;
	}

	public Human(String name, String gender) {
		Name=name;
		Gender=gender;
		
	}
	

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public double getHeight() {
		return Height;
	}


	public void setHeight(double height) {
		Height = height;
	}


	public double getWeight() {
		return Weight;
	}


	public void setWeight(double weight) {
		Weight = weight;
	}



}
