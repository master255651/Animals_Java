
public class Fish extends Animal implements Swim {
	
	public String tip;//речная, морская, озёрная
	public Fish (String name, float height, float weight, int age, String tip) {
		super(name, height, weight, age);
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.tip = tip;
	}
	
	public Fish () {
		
	}
	
	public void swim(){
		System.out.println("Swimming...");
	}
	
	public String get_tip() {
		return tip;
	}
	
	@Override
	public String toString() {
        return "Fish{" +
                "name='" + super.name + '\'' +
                ", height=" + super.height + '\'' +
                ", weight=" + super.weight + '\'' +
                ", age=" + super.age + '\'' +
                ", tip='" + tip + 
                "} ";
    }
}