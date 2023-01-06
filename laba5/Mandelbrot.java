import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator {
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -1.5;
        range.width = 3;
        range.height = 3;
    }

    public static final int MAX_ITERATIONS = 2000;

    public int numIterations(double x, double y) {

        int iteration = 0;
        double real = 0;
        double imaginary = 0;

        // Compute Zn = Zn-1^2 + c
        while (iteration < MAX_ITERATIONS &&
                real * real + imaginary * imaginary < 4) {
            double realNew = real * real - imaginary * imaginary + x;
            double imaginaryNew = 2 * real * imaginary + y;
            real = realNew;
            imaginary = imaginaryNew;

            iteration += 1;
        }

        if (iteration == MAX_ITERATIONS) {
            return -1;
        }

        return iteration;
    }
    
    public String toString() {
        return "Mandelbrot";
    }
}