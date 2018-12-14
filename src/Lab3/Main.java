package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void testArrayList(){
        ArrayList a=new ArrayList(31);
        a.add(0,4);
        a.add(4,5);
    }
    public static void main(String[] args){
  /*      Employee emp=new Employee(25, "Steave", 123, "Dev", "Developer", 20);
        System.out.println(emp);
        emp.addHour(3);
        emp.addHour(8);
        System.out.println(emp);
        Employee emp2=new Employee(25, "John", 356, "Test", "tester", 22);

        Company c=new Company("Google");
        c.addEmployee(emp);
        c.addEmployee(emp2);
        System.out.println("\n\n"+c.getEmployeeByCnp(356));

        int cnp=123;
        System.out.println("Salary for: \n\t"+c.getEmployeeByCnp(cnp) +
                "\n is: " + c.getSalaryByCnp(cnp));


        Person p1=new Person(20,"Andrei", 123);
        Person p2=new Person(22,"Andrei", 123);
        Person p3=new Person(24,"Andrei", 124);

        System.out.println("p1=p2  is "+ p1.equals(p2));
        boolean result;
        if(p1==p2){
            result=true;
        }else{
            result=false;
        }
        System.out.println("p1==p2  is "+ result);
        System.out.println("p2=p3  is "+ p2.equals(p3));*/
        testArrayList();
    }
}
