import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Student{
String name;
int marks;
Student(String name,int marks){
    this.marks=marks;
    this.name=name;

}
public String toString(){
    return name+ "(" + marks + ")";

}
}


class arraylist8 {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("astha",97));
        students.add(new Student("arya",94));

        students.add(new Student("aayana",87));

    students.sort((a,b)-> a.marks-b.marks);
       for(Student s: students){
        System.out.println(s);
       }
    }
}
