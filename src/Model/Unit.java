package Model;

public class Unit {
	protected int hp;
	protected String name;
	
	public Unit(String name, int hp) {
		this.hp=hp;
		this.name = name;
	}

	public void inform() {
		System.out.println("hp´Â" + hp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


