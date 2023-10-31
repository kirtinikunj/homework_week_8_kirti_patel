package homework_week_8;

public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public double setFirstNumber(double fNumber){
        firstNumber=fNumber;
        return firstNumber;
    }

    public double setSecondNumber(double sNumber){
        secondNumber =sNumber;
        return secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }

    public double getDivisionResult(){
        if(secondNumber ==0){
            return 0;
        }
        return firstNumber/secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = "+calculator.getAdditionResult());
        System.out.println("subtract = "+calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiply = "+calculator.getMultiplicationResult());
        System.out.println("divide = "+calculator.getDivisionResult());
    }

}
