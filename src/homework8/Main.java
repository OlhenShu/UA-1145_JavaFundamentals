package homework8;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(new FullName("Konstyantin", "Anlaki"),52, 3);
        Student s2 = new Student(new FullName("Bodya", "Dreksovich"),34, 1);
        System.out.println(s1.activity()+" "+s1.info());
        System.out.println(s2.activity()+" "+s2.info());
        try {
            Student s3 = (Student) s1.clone();
            s3.setStudentCourse(4);
            System.out.println(s3.activity()+" "+s3.info());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        try {
            Student s4 = (Student) s2.clone();
            s4.setStudentCourse(2);
            System.out.println(s4.activity()+" "+s4.info());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
