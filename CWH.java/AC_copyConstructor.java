public class AC_copyConstructor {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "Shradha";
       s1.rollno = 123;
       s1.password = "abcd";
       s1.marks[0] = 100;
       s1.marks[1] = 90;
       s1.marks[2] = 80; 

       Student s2 = new Student(s1);
       s2.password=  "xyz";
       s1.marks[2] = 100;

       for(int i=0;i<3;i++){
        System.out.print(s2.marks[i]+" ");
       }
    }
}

class Student{
    String name;
    int rollno ;
    String password;
    int marks[];


    Student(){
        marks = new int[3];
    }
    //shallow copy constructor
 //     Student(Student s1){
 //         marks = new int[3];
 //         this.name = s1.name;
 //         this.rollno = s1.rollno;
 //         this.marks = s1.marks;
 //     }
    //deep copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.rollno = s1.rollno;
        marks = new int[3];
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }

 }
