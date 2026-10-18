package pr7;

public class MathFunc implements MathCalculable {

    @Override
    public Complex pow(Complex base, int exponent) {
        Complex result = new Complex(1, 0); // 1 + 0i
        for (int i = 0; i < exponent; i++) {
            result = result.multiply(base);
        }
        return result;
    }

    @Override
    public double abs(Complex number) {
        return Math.sqrt(number.getReal() * number.getReal()
                + number.getImaginary() * number.getImaginary());
    }

    @Override
    public double circleLength(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, -2);

        System.out.println("Комплексные числа");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        System.out.println("\nСложение и умножение");
        System.out.println("c1 + c2 = " + c1.add(c2));
        System.out.println("c1 * c2 = " + c1.multiply(c2));

        System.out.println("\nВозведение в степень");
        System.out.println("c1^2 = " + mc1.pow(c1, 2)); // (3+4i)^2 = -7 + 24i
        System.out.println("c1^3 = " + mc1.pow(c1, 3));

        System.out.println("\nМодуль комплексного числа");
        System.out.printf("|c1| = %.4f%n", mc1.abs(c1)); // 5.0
        System.out.printf("|c2| = %.4f%n", mc1.abs(c2));

        System.out.println("\nДлина окружности");
        System.out.printf("R = 10 -> C = %.4f%n", mc1.circleLength(10));
        System.out.printf("Константа PI = %.6f%n", MathCalculable.PI);
    }
}
