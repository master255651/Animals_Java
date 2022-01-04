
public class Cat extends Animal implements Crawl,Swim,Walk {
	
	public String poroda;
	public Cat (String name, float height, float weight, int age, String poroda) {
		super(name, height, weight, age);
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.poroda = poroda;
	}
	
	public Cat() {
        
    }

	public void walk(){
		System.out.println("Walking...");
	}
	
	public void swim(){
		System.out.println("Swimming...");
	}
	
	public void crawl(){
		System.out.println("Crawling...");
	}
	
	public String get_poroda() {
		return poroda;
	}
	
	@Override
	public String toString() {
        return "Cat{" +
                "name='" + super.name + '\'' +
                ", height=" + super.height + '\'' +
                ", weight=" + super.weight + '\'' +
                ", age=" + super.age + '\'' +
                ", poroda='" + poroda + 
                "} ";
    }
}
