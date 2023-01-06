import java.awt.geom.Rectangle2D;

public class Tricorn extends FractalGenerator {
    public static final int MAX_ITERATIONS = 2000;

    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -2;
        range.width = 4;
        range.height = 4;
    }

    public int numIterations(double x, double y) {
        int iteration = 0;
        double real = 0;
        double imaginary = 0;

        while (iteration < MAX_ITERATIONS &&
                real * real + imaginary * imaginary < 4) {
            double realUpdated = real * real - imaginary * imaginary + x;
            double imaginaryUpdated = -2 * real * imaginary + y;
            real = realUpdated;
            imaginary = imaginaryUpdated;
            iteration += 1;
        }
        if (iteration == MAX_ITERATIONS) {
            return -1;
        }
        return iteration;
    }

    public String toString() {
        return "Tricorn";
    }
}