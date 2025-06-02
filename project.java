import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name;
    int marks;
  
    Student(int marks,String name){
        this.name=name;
        this.marks=marks;
    }

}

public class project {

    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        ArrayList<Student>list=new ArrayList<>();
        System.out.println("how many students data neends to be collected ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
        System.out.println("enter name of  student " + (i+1) + ":" );
        String name=sc.nextLine();
        System.out.println("enter  marks of "+ name + " :");
        int marks=sc.nextInt();
        sc.nextLine();
        list.add(new Student(marks, name));
        }

        //print all students name
        System.out.println("all students name");
        for(Student  s: list){
System.out.println(s.name +" ->" + s.marks);
        }
        System.out.println("enter students name to search");
        String Searchname=sc.nextLine();
        boolean found=false;
        for(Student s: list){
            if(s.name.equalsIgnoreCase(Searchname)){
                System.out.println(s.name+ " scored "+ s.marks+ " marks ");
                found=true;
                break;

            }
        }
        if(!found){
            System.out.println("student not found");
        }
        //find students with highest marks

        Student topper=list.get(0);
        for(Student s: list)
{
    if(s.marks>topper.marks){
topper=s;

    }
}
System.out.println("\n topper : " + topper.name+ " with "+ topper.marks+ " marks ");
}
}

