//1)create a class Employee with following properties and method
class Employee {
    private int Salary = 12000;
    private String name = "hello";

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getSalary() {
        return Salary;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }
};

public class chapter8 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setname("harry");// set name instead of hello to harry
        System.out.println("Salary is: " + obj.getSalary());
        System.out.println("name is: " + obj.getname());

    }
}

/////////////////////////////
/// 2)Create a class cellPhone with method to print "ringing", "vibrating"
// class cellPhone{
// void first(){
// System.out.println("ringing");
// }
// void second(){
// System.out.println("vibrating");
// }
// }
// public class chapter8{
// public static void main(String[] args) {
// cellPhone obj = new cellPhone();
// obj.first();
// obj.second();
// }
// }

////////////////////////////////
/// 3)create a class square with a method to initialize its side, calculating
//////////////////////////////// area, perimeter
// class square{
// void side(){
// System.out.println("Square have 4 sides");
// }
// void area(){
// System.out.println("Square's area is side^2");
// }
// void perimeter(){
// System.out.println("Square's perimeter would be side^2");
// }

// }
// public class chapter8{
// public static void main(String[] args) {
// square obj = new square();
// obj.side();
// obj.area();
// obj.perimeter();
// }
// }

//////////////////////////////////////////
/// 4)