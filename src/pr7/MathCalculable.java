package pr7;

public interface MathCalculable {
    double PI = 3.141592653589793;

    Complex pow(Complex base, int exponent);

    double abs(Complex number);

    double circleLength(double radius);
}