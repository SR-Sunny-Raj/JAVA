public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.setName("Sunny Raj");
        s1.setRollno(116);
        s1.setAge(20);
        System.out.println("Name is :- "+s1.getName());
        System.out.println("Roll No. is :- "+s1.getRollno());
        System.out.println("Age is :- "+s1.getAge());
    }
}
