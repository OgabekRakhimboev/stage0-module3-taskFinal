package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void main(String [] args){
        revert(457);
    }
    public static void revert(int number) {

        System.out.println((number%10) * 100 + (number%100/10) * 10 + number / 100);

    }
}
