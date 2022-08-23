package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void main(String [] args){
        calculateSum(1919);
    }
    public static void calculateSum(int number) {
        System.out.println(number%10 + number%100/10 + number%1000/100 + number/1000);
    }
}
