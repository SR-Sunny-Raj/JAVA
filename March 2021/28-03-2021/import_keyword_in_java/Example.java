package pack1;
import pack2.Student;
public class Example{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setRollno(116);
		s1.setName("Sunny Raj");
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
	}
}