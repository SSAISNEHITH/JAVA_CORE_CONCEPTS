public class class_and_object_task {
    /*Create a simple Java program for managing student records in a school. The Student class stores name
     and grade attributes, uses a constructor for initialization, and includes methods to display details and
     update grades
     */
    static class student{
        String name;
        float grade;
        student(String name,float grade){
            this.name=name;
            this.grade=grade;
        }
        void display_info(){
            System.out.println("Name->"+name+"\nGrade->"+grade);
        }
    }

    static void main(String[] args) {
        student roll1=new student("Kishore",8.9f);
        student roll2=new student("laurence",9.3f);
        roll1.display_info();
        roll2.display_info();
    }

}
