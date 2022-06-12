package java006;

public class P02_Add {

	String name;
	int age, offensePower, defensePower;

	public void Character(String name, int age, int offensePower, int defensePower) {
		this.name = name;
		this.age = age;
		this.offensePower = offensePower;
		this.defensePower = defensePower;
		System.out.println(this.name + " / " + this.age + " / " + this.offensePower + " / " + this.defensePower);
	}

}
