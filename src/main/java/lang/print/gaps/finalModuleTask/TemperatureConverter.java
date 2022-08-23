package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void main(String [] args){
        toFahrenheit(5);

    }
    public static void toFahrenheit(int temperatureCelsius){
        System.out.println((temperatureCelsius*9/5F)+32);
    }
}
