import java.util.Objects;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {

        return re;
    }

    public double getIm() {

        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(re, that.re) == 0 && Double.compare(im, that.im) == 0;
    }

    @Override
    public int hashCode() {
        int reHash = (int) (Double.doubleToLongBits(re) ^ (Double.doubleToLongBits(re) >>> 32));
        return 31 * reHash + (int) (Double.doubleToLongBits(im) ^ (Double.doubleToLongBits(im) >>> 32));
    }
}