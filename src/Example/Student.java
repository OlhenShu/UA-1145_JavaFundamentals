package Example;
import static Example.Main.SCANNER;

public class Student {
    static private int totalStudents;
    static private int totalRating;
    private String name;
    private int rating;


    public Student() {
        this("N/A", 0);
    }

    public Student( String name, int rating) {
        this.name = name;
        this.rating = rating;
        totalStudents++;
        totalRating +=rating;
    }

    static public double avgRating() {
        return totalRating / (double) totalStudents;
    }

    static public int getTotalRating() {

        return totalRating;
    }

    public static void printStatistics() {
        System.out.println("Total rating is: " + Student.getTotalRating());
        System.out.println("Average rating is: %.2f".formatted(Student.avgRating()));
    }
    public static void promptParameters(Student student) {
        System.out.println("Input name: ");
        String name = SCANNER.nextLine();
        SCANNER.nextLine();
        student.setName(name);
        System.out.println("Please enter the rating for student " + student.getName() + ": ");
        double rating = SCANNER.nextDouble();
        SCANNER.nextLine();
        student.setRating((int) rating);
    }

    /**
     * Compare myself with other student by rating
     *
     * @param other - the other student to compare with
     * @return - whether I have better rating then the other
     */

    public boolean betterStudent(Student other)
    {
        return rating > other.rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String getName(){

        return name;
    }
    public int getRating() {

        return rating;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRating(int rating) {
        totalRating -= rating;
        this.rating = rating;
        totalRating += rating;
    }



}
