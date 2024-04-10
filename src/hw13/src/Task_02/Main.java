package Task_02;

public class Main {
    public static void main(String[] args) {
        String date = DateValid.inputDate();
        System.out.println("Validation of date is: " + DateValid.isValid(date));
    }
}
