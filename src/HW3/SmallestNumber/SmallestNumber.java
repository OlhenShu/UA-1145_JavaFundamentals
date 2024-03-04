package HW3.SmallestNumber;

public class SmallestNumber {
    int firstNumber;
    int secondNumber;
    int thirdNumber;
    public SmallestNumber (int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
        this.thirdNumber=thirdNumber;
    }
    public int getMinNumber() {
        int minNumber;
        if (firstNumber<secondNumber) {
            minNumber=firstNumber;
        }
        else {
            minNumber=secondNumber;
        }
        if (thirdNumber<minNumber) {
            minNumber=thirdNumber;
        }
        return minNumber;
    }
}
