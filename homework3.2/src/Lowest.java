public class Lowest {

    public static int findLowestNumber(int num1, int num2, int num3){
        int min = num1;
        if(num2<min){
            min = num2;
        }
        else if(num3 < min){
            min = num3;
        }
        return min;
    }
}
