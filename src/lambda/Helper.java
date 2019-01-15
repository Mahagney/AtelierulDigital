package lambda;

import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static void students(){
        List<Student> students=new ArrayList<Student>();
        Student s1=new Student(2011,3);
        Student s2=new Student(2009,15);
        Student s3=new Student(2011,3);
        Student s4=new Student(2009,120);
        Student s5=new Student(2011,124);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        int res=students.stream()
                .filter(s -> s.getGradYear()==2011)
                .map(s-> s.getScore())
                .max((st1,st2)->st1-st2)
                .get();

        System.out.println("result="+res);
    }
}
