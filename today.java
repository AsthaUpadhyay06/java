import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int age;
    String name;
    int enrollNo;

public Student(int age,String name,int enrollNo){
    this.age=age;
    this.name=name;
    this.enrollNo=enrollNo;
}

 public String  toString(){
     return age+" "+name+" "+enrollNo;    
 }

 }

 class sortbyname implements  Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);

    }
    
}
class sortbyage implements  Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.age-s2.age;

    }

 }
 class today{
    public static void main(String[] args) {
    ArrayList<Student> list=new ArrayList<>();
     list.add(new Student(18, "rahul",54)); 
     list.add(new Student(11, "rajeev",45)); 
     list.add(new Student(19, "prem",25));
      list.add(new Student(13, "Aryan",67));
   
       System.out.println("according to name:");
    Collections.sort(list, new sortbyname());
        for(Student s1 :list){
            System.out.println(s1);
            
        }
        System.out.println("according to age:");
        Collections.sort(list,new sortbyage());//age acording
        for(Student s2 :list){
            System.out.println(s2);
        }
    }
}


    