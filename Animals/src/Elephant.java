
public class Elephant extends Animal implements Walk {
	
	public int DlinaBivnia;
	public Elephant (String name, float height, float weight, int age, int DlinaBivnia) {
		super(name, height, weight, age);
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.DlinaBivnia = DlinaBivnia;
	}
	
	public Elephant () {
		
	}
	
	public void walk(){
		System.out.println("Walking...");
	}
	
	public int get_DlinaBivnia() {
		return DlinaBivnia;
	}
	
	@Override
	public String toString() {
        return "Elephant{" +
                "name='" + super.name + '\'' +
                ", height=" + super.height + '\'' +
                ", weight=" + super.weight + '\'' +
                ", age=" + super.age + '\'' +
                ", DlinaBivnia='" + DlinaBivnia + 
                "} ";
    }
}