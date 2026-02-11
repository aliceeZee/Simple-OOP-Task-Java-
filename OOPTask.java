
 
 public class Student {
        String name;
        int age;
        String course;
        
    public Student (String a, int b, String c) {
        name = a;
        age = b;
        course = c;
    }
    public void displayInfo() {
        System.out.println("===================================\n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    }

 public class OOPTask {


    public static void main(String[] args) {
        Student student1 = new Student("Eunice",19,"BSIT");
        Student student2 = new Student("Yunnah Rie",20,"BSCS");

        System.out.println("\tSTUDENT INFORMATION");
        student1.displayInfo();
        student2.displayInfo();

    }
}
