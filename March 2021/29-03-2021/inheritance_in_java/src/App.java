
public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.setName("Sunny Raj");
        s1.setAge(21);
        s1.setRollno(116);
        System.out.println("Students Information -: \nName -: " + s1.getName() + "\nAge -: " + s1.getAge()
                + "\nRoll no. -: " + s1.getRollno());
    }
}
