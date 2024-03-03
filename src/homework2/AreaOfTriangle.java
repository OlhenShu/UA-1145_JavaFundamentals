package homework2;
import java.util.Scanner;
public class AreaOfTriangle {
  public static void main(String[] args) {
      double a = 0;
      double b = 0;
      double c = 0;
      double sqr=triangleSquare(a,b,c);
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Input side one: ");
      a = sc1.nextInt();
      System.out.println("Input side two : ");
      b = sc1.nextInt();
      System.out.println("Input side three: ");
      c = sc1.nextInt();
      sc1.close();
      System.out.println("The area of the triangle is: " + AreaOfTriangle.triangleSquare(a,b,c));

      }

     public static double triangleSquare(double c, double d, double e) {
        double p;
        double S;
        p=(c+d+e)/2;
        S=Math.sqrt(p*(p-c)*(p-d)*(p-e));
        return S;
  }


}
