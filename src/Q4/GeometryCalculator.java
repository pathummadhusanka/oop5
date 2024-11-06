package Q4;

public class GeometryCalculator {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        System.out.println("pi: " + mathOperations.getPi());

        System.out.println("Circle: " + mathOperations.calculateCircleArea(5));
        System.out.println("Square: " + mathOperations.calculateSquareArea(4));
    }
}
