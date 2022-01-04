//Я разработал проект на тему: Животные, который будет управлять данными о коллекции. 
//Каждое существо основано на классе Animal, который имеет имя, вес, рост и возраст.
//Из класса Animal будет получен класс Cat, Elephant, Fish, к которому  добавлены следующие интерфейсы и характеристики:
//Crawl, Fly, Swim, Walk, Poroda Cat, Tip Fish, Dlina-bivnea Elephant.
//Создаk класс Test, в котором я устанавил список элементов типа Cat, Fish, Elephant, которые будут считываться с клавиатуры и с файла.
//А также определил в классе Test следующие методы:
//- количество кошек британской породы
//- рассчитает и отобразит атрибуты слона, с максимальным бивнем
//- вычислит и вернет количество рыб, с весом больше 5 кг.
//- экспортирует список в файл
//- импортирует список из файла
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
	static Scanner in = new Scanner(System.in);
	
	static void PorodaBritish(Cat[] cats, int NumCat) {
		int k = 0;
		for(int i = 0; i < NumCat; i++){
			if( cats[i].poroda.equals("British") ) k++;
		}
		System.out.println("Numarul de cats with poroda British: " + k);
	}
	
	static void MaxBiveni(Elephant[] elephants, int NumElephant) {
		int max = 0; 
		for(int i = 0; i < NumElephant; i++){
			if( elephants[i].DlinaBivnia > max) max = elephants[i].DlinaBivnia;
		}
		
		for(int i = 0; i < NumElephant; i++){
			if( elephants[i].DlinaBivnia == max) {
				System.out.println( "Elephant with max biveni: \n" + elephants[i].toString() );
			}
		}
	}
	
	static void TipMax(Fish[] fishs, int NumFish) {
		int k = 0;
		for(int i = 0; i < NumFish; i++){
			if( fishs[i].weight > 5) k++;
		}
		System.out.println("Numarul de fish with weight > 5: " + k);
	}
	
	public static void main(String[] args) {

		int NumCat = 5;
		int NumFish = 5;
		int NumElephant = 5;
		
		Cat cats[] = new Cat[NumCat];
		Fish fishs[] = new Fish[NumFish];
		Elephant elephants[] = new Elephant[NumElephant];
		
		System.out.print("Menu:\n 1 - Enter date from keyboard.\n 2 - Date from file.\n 3 - Rewrite file.\n 4 - Number of cats british.\n 5 - Elephant with max biveni.\n 6 - Fish with weight > 5.\n");
		
		int ch = in.nextInt();
		while( ch != 0) {
			switch (ch) {
			case 1:{
				System.out.print("Vvedite kolichestvo cats: ");
				NumCat = in.nextInt();
				
				System.out.print("Vvedite kolichestvo fishs: ");
				NumFish = in.nextInt();
				
				System.out.print("Vvedite kolichestvo elephants: ");
				NumElephant = in.nextInt();
				
				for(int i = 0; i < NumCat; i++) {
					cats[i] = new Cat();
					
					System.out.print("\nVvedite name cat: ");
					cats[i].name = in.next();
					
					System.out.print("Vvedite height cat: ");
					cats[i].height = in.nextInt();
					
					System.out.print("Vvedite weight cat: ");
					cats[i].weight = in.nextInt();
					
					System.out.print("Vvedite age cat: ");
					cats[i].age = in.nextInt();
					
					System.out.print("Vvedite poroda cat: ");
					cats[i].poroda = in.next();
					
				}
				
				for(int i = 0; i < NumFish; i++) {
					fishs[i] = new Fish();
					
					System.out.print("\nVvedite name fish: ");
					fishs[i].name = in.next();
					
					System.out.print("Vvedite height fish: ");
					fishs[i].height = in.nextInt();
					
					System.out.print("Vvedite weight fish: ");
					fishs[i].weight = in.nextInt();
					
					System.out.print("Vvedite age fish: ");
					fishs[i].age = in.nextInt();
					
					System.out.print("Vvedite tip fish: ");
					fishs[i].tip = in.next();
					
				}
				
				for(int i = 0; i < NumElephant; i++) {
					elephants[i] = new Elephant();
					
					System.out.print("\nVvedite name elephant: ");
					elephants[i].name = in.next();
					
					System.out.print("Vvedite height elephant: ");
					elephants[i].height = in.nextInt();
					
					System.out.print("Vvedite weight elephant: ");
					elephants[i].weight = in.nextInt();
					
					System.out.print("Vvedite age elephant: ");
					elephants[i].age = in.nextInt();
					
					System.out.print("Vvedite dlina-bivnia elephant: ");
					elephants[i].DlinaBivnia = in.nextInt();
					
				}
				System.out.println("\n");
				
				if(NumCat != 0) {
					cats[0].Sleep();
					cats[0].Eat();
					cats[0].walk();
					cats[0].crawl();
					cats[0].swim();
				}
				for(int i = 0; i < NumCat; i++) {
					System.out.println(cats[i].toString() + "\n");
				}
				
				if(NumFish != 0) {
					fishs[0].Sleep();
					fishs[0].Eat();
					fishs[0].swim();
				}
				for(int i = 0; i < NumFish; i++) {
					System.out.println(fishs[i].toString() + "\n");
				}
				
				if(NumElephant != 0) {
					elephants[0].Sleep();
					elephants[0].Eat();
					elephants[0].walk();
				}
				for(int i = 0; i < NumElephant; i++) {
					System.out.println(elephants[i].toString() + "\n");
				}
			}
	        break;
			
			case 2:{
	        try {
				File file = new File("Animale.txt");
				if(file.exists()){
					Scanner scanner = new Scanner(file);
					
					NumCat = scanner.nextInt();
					String line;
					for(int i = 0; i < NumCat ; i++) {
						cats[i] = new Cat();
						
						line = scanner.next();
						cats[i].name = line;
						
						line = scanner.next();
						cats[i].height = Float.parseFloat(line);
						
						line = scanner.next();
						cats[i].weight = Float.parseFloat(line);
						
						line = scanner.next();
						cats[i].age = Integer.parseInt(line);
						
						line = scanner.next();
						cats[i].poroda = line;
					}
					
					NumFish = scanner.nextInt();
					for(int i = 0; i < NumFish ; i++) {
						fishs[i] = new Fish();
							
						line = scanner.next();
						fishs[i].name = line;
							
						line = scanner.next();
						fishs[i].height = Float.parseFloat(line);
							
						line = scanner.next();
						fishs[i].weight = Float.parseFloat(line);
							
						line = scanner.next();
						fishs[i].age = Integer.parseInt(line);
							
						line = scanner.next();
						fishs[i].tip = line;
					}
					
					NumElephant = scanner.nextInt();
					for(int i = 0; i < NumElephant ; i++) {
						elephants[i] = new Elephant();
								
						line = scanner.next();
						elephants[i].name = line;
								
						line = scanner.next();
						elephants[i].height = Float.parseFloat(line);
								
						line = scanner.next();
						elephants[i].weight = Float.parseFloat(line);
								
						line = scanner.next();
						elephants[i].age = Integer.parseInt(line);
								
						line = scanner.next();
						elephants[i].DlinaBivnia = Integer.parseInt(line);
  
					}
				
					System.out.print(cats[0].name);
        		scanner.close();
				}
				else System.out.println("File not exist!");
        	} catch (IOException e) {
        		System.out.println("Error:" + e);
        	}
			
	        System.out.println("\n");
			
			if(NumCat != 0) {
				cats[0].Sleep();
				cats[0].Eat();
				cats[0].walk();
				cats[0].crawl();
				cats[0].swim();
			}
			for(int i = 0; i < NumCat; i++) {
				System.out.println(cats[i].toString() + "\n");
			}
			
			if(NumFish != 0) {
				fishs[0].Sleep();
				fishs[0].Eat();
				fishs[0].swim();
			}
			for(int i = 0; i < NumFish; i++) {
				System.out.println(fishs[i].toString() + "\n");
			}
			
			if(NumElephant != 0) {
				elephants[0].Sleep();
				elephants[0].Eat();
				elephants[0].walk();
			}
			for(int i = 0; i < NumElephant; i++) {
				System.out.println(elephants[i].toString() + "\n");
			} 
			
		}
		break;
		
			case 3:{
				File file = new File("Animale.txt");
				try {
					PrintWriter pw;
					pw = new PrintWriter(file);
					pw.print(String.valueOf(NumCat) + "\n");
					for (int i = 0; i < NumCat; i++) {
						pw.print(cats[i].name);
						pw.print(" ");
						pw.print(cats[i].height);
						pw.print(" ");
						pw.print(cats[i].weight);
						pw.print(" ");
						pw.print(cats[i].age);
						pw.print(" ");
						pw.print(cats[i].poroda);
						pw.print("\n");
					}
					
					pw.print(String.valueOf(NumFish) + "\n");
					for (int i = 0; i < NumFish; i++) {
						pw.print(fishs[i].name);
						pw.print(" ");
						pw.print(fishs[i].height);
						pw.print(" ");
						pw.print(fishs[i].weight);
						pw.print(" ");
						pw.print(fishs[i].age);
						pw.print(" ");
						pw.print(fishs[i].tip);
						pw.print("\n");
					}
					
					pw.print(String.valueOf(NumElephant) + "\n");
					for (int i = 0; i < NumElephant; i++) {
						pw.print(elephants[i].name);
						pw.print(" ");
						pw.print(elephants[i].height);
						pw.print(" ");
						pw.print(elephants[i].weight);
						pw.print(" ");
						pw.print(elephants[i].age);
						pw.print(" ");
						pw.print(elephants[i].DlinaBivnia);
						pw.print("\n");
					}
					pw.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			}
			break;
			
			case 4:{
				PorodaBritish(cats, NumCat);
			}
			break;
			
			case 5:{
				MaxBiveni(elephants, NumElephant);
			}
			break;
			
			case 6:{
				TipMax(fishs, NumFish);
			}
			break;
			}
			System.out.print("Menu:\n 1 - Enter date from keyboard.\n 2 - Date from file.\n 3 - Rewrite file.\n 4 - Number of cats british.\n 5 - Elephant with max biveni.\n 6 - Fish with weight > 5.\n");
			ch = in.nextInt();
		}
		
	}

}
