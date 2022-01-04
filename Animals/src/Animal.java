public abstract class Animal {
	
	final 
	public String name;
	public float height;
	public float weight;
	public int age;
	

	public Animal( String name,  float height,  float weight,  int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
	
	public Animal() {
        
    }
	
	public void Sleep() {
		System.out.println("Zzzzz...");
	}
	
	public void Eat() {
		System.out.println("Ham...Ham");
	}
	
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

}