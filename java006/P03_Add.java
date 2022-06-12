package java006;

public class P03_Add {
	String name;
	int age, offensePower, defensePower;

	public void Character(String name, int age, int offensePower, int defensePower) {
		this.name = name;
		this.age = age;
		this.offensePower = offensePower;
		this.defensePower = defensePower;
		System.out.println(this.name + " / " + this.age + " / " + this.offensePower + " / " + this.defensePower);
	}

	public void Character(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name + " / " + this.age + " / " + " 35 / 42");
	}

	public void Character(String name) {
		this.name = name;
		System.out.println(this.name + " / 1213 / 46 / 38");
	}

}
