package class071502;

public class Student_Main {

	public static void main(String[] args) {
		System.out.print("이름" + "\t"+"나이" + "\t"+"성별" + "\t"+"키" + "\t"+"몸무게");
		System.out.println("\n");
		
		Student stu1 = new Student("순범",27,"M",180,70);
//		System.out.print(stu1.name + "\t");
//		System.out.print(stu1.age + "\t");
//		System.out.print(stu1.gender + "\t");
//		System.out.print(stu1.tall + "\t");
//		System.out.print(stu1.weight + "\t");
//		System.out.println();
//		System.out.println(stu1.toString());
		
		
		Student stu2 = new Student("태광",24,"M",180,73);
//		System.out.print(stu2.name + "\t");
//		System.out.print(stu2.age + "\t");
//		System.out.print(stu2.gender + "\t");
//		System.out.print(stu2.tall + "\t");
//		System.out.print(stu2.weight + "\t");
//		System.out.println();
		
		Student stu3 = new Student("시우",30,"M",180,75);
//		System.out.print(stu3.name + "\t");
//		System.out.print(stu3.age + "\t");
//		System.out.print(stu3.gender + "\t");
//		System.out.print(stu3.tall + "\t");
//		System.out.print(stu3.weight + "\t");
		
		Student stu4 = new Student(24,"F",170,60);
		System.out.println(stu4.toString());
	}

}
