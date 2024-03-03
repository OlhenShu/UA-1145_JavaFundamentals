package First;
import java.util.Locale;
import static First.Main.SCANNER;
public class Method {
    public static void calculateArea() {
        Locale.setDefault(Locale.ROOT);
        System.out.println("Input side 1: ");
        int firstSide = SCANNER.nextInt();
        System.out.println("Input side 2: ");
        int secondSide = SCANNER.nextInt();
        System.out.println("Input side 3: ");
        int thirdSide = SCANNER.nextInt();

        // шукає півпериметр для використання формули Герона
        int halfPerimeter = (firstSide + secondSide + thirdSide) / 2;

        // шукає площу за формулою Герона
        double area = Math.sqrt(halfPerimeter*(halfPerimeter - firstSide)*(halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
        System.out.println("The area of the triangle is: %.2f".formatted(area));
    }
}
