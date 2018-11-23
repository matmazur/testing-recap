import java.util.Arrays;

public class MyCalculator {

    public double multiply(double a, double b){
        return a*b;
    }

    public double add (double ... args){

        return Arrays.stream(args).sum();
    }
}
