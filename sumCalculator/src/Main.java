public class Main {

    public static void main(String[] args) {
        sumCalculator calculator= new sumCalculator();
        calculator.setFirstNumber(46);
        calculator.setSecondNumber(45);
        System.out.println("Addition Result: "+ calculator.getAdditionResult());
        System.out.println("Subtraction Result: "+ calculator.getSubtractionResult());
        System.out.println("Multiplication Result: "+ calculator.getMultiplicationResult());
        System.out.println("Division Result: "+ calculator.getDivisionResult());
        calculator.setFirstNumber(44);
        calculator.setSecondNumber(0);
        System.out.println("Division Result: "+ calculator.getDivisionResult());

    }
}
