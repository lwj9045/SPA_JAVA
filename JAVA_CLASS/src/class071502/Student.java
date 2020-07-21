package class071502;

public class Student {

	String name;
	int age;
	String gender;
	int tall;
	int weight;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", tall=" + tall + ", weight=" + weight
				+ "]";
	}
//	public Student(String name, int age, String gender, int tall, int weight) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.tall = tall;
//		this.weight = weight;
//		
//	}
	Student(){
		
	}
	
	Student(String name, int age, String gender, int tall, int weight){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.tall = tall;
		this.weight = weight;
	}
	
	
	// overloading : 생성자는 여러개 생성가능
	Student(int age, String gender, int tall, int weight){
		
		this.age = age;
		this.gender = gender;
		this.tall = tall;
		this.weight = weight;
	}

	
}
	
	
	
	
	
	
	
	
	

