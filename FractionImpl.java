
import java.util.ArrayList;

public class FractionImpl implements Fraction {

    private int numerator;
    private int denominator;


    /**
     * This method is used to get the smaller value of two integers.
     * @param num_abs This is the absolute value of numerator.
     * @param den_abs This is the absolute value of denominator.
     * @return int This returns the smaller value of num_abs and den_abs.
     */
    private int getSmaller(int num_abs, int den_abs) {
        // set the smaller value of num_abs and den_abs to smaller
        int smaller = num_abs <= den_abs ? num_abs : den_abs;
        return smaller;
    }


    /**
     * This method is used to get the Greatest Common Divisor (GCD) of two integers.
     * @param numerator This is the numerator value passed in.
     * @param denominator This is the denominator value passed in.
     * @return int This returns the GCD of numerator and denominator.
     */
    private int getGCD(int numerator, int denominator) {
        int gcd = 1;
        int num_abs = Math.abs(numerator);
        int den_abs = Math.abs(denominator);
        // algorithm to get GCD
        for (int i = 2; i <= getSmaller(num_abs, den_abs); i++) {
            if ((num_abs % i == 0) && (den_abs % i == 0)) gcd = i;
        }
        return gcd;
    }


    /**
     * This method is used to retrieve numerator (and denominator) from the string passed in.
     * @param fraction This is the string value passed in.
     * @return ArrayList<Integer> This is ArrayList of integer(s) retrieved from the string.
     * @exception NumberFormatException will be thrown if value could not be parsed into integer correctly.
     */
    private ArrayList<Integer> getNumDen(String fraction){

        // rst_str used to store numerator (and denominator) in string(s)
        String[] rst_str = fraction.split("/");

        // rst_num used to store numerator (and denominator) in integer(s)
        ArrayList<Integer> rst_num = new ArrayList<>();

        for (int i = 0; i < rst_str.length; i++) {
            // remove space
            rst_str[i] = rst_str[i].trim();
            // parse string to integer (NumberFormatException might be thrown)
            int n = Integer.parseInt(rst_str[i]);
            // add the integer to rst_num
            rst_num.add(n);
        }
        return rst_num;
    }


    /**
     * This method is used to set up the instance variables based on the values passed in.
     * @param numerator This is the numerator value passed in.
     * @param denominator This is the denominator value passed in.
     * @exception ArithmeticException will be thrown if denominator is zero.
     */
    private void setUpNumDen(int numerator, int denominator) {

        // cases where ArithmeticException will be thrown if denominator is zero
        if (denominator == 0) {
            throw new ArithmeticException("Divide by zero.");
        }
        // cases where denominator will be set to one if numerator is zero
        else if (numerator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        }
        // cases where normalization required
        else {
            // get GCD of numerator and denominator
            int gcd = getGCD(numerator, denominator);
            // move the negative sign to numerator if denominator is negative
            if (denominator < 0) {
                this.numerator = - (numerator / gcd);
                this.denominator = - (denominator / gcd);
            }
            else {
                this.numerator = numerator / gcd;
                this.denominator = denominator / gcd;
            }
        }
    }


    /**
     * This constructor will initiate a fraction object based on the values of numerator and denominator passed in.
     * @param numerator This is the numerator value passed in.
     * @param denominator This is the denominator value passed in.
     * @exception ArithmeticException will be thrown if denominator is zero.
     */
    public FractionImpl(int numerator, int denominator) {
        // pass arguments to setUpNumDen() to initialize instance variables
        setUpNumDen(numerator, denominator);
    }


    /**
     * This constructor will initiate a fraction object based on the value of whole number passed in.
     * Denominator will be one implicitly.
     * @param wholeNumber This represents the numerator.
     */
    public FractionImpl(int wholeNumber) {
        // pass argument to setUpNumDen() to initialize instance variables
        setUpNumDen(wholeNumber, 1);
    }


    /**
     * This constructor will initiate a fraction object based on the string value of fraction passed in.
     * Denominator will be one if only numerator specified in fraction.
     * @param fraction This is string value passed in.
     * @exception NumberFormatException will be thrown if the string value could not be parsed into integer correctly.
     * @exception ArithmeticException will be thrown if denominator is zero.
     */
    public FractionImpl(String fraction) {
        // pass fraction to getNumDen() to retrieve numerator (and denominator) in integer(s)
        ArrayList<Integer> numbs = getNumDen(fraction);

        // if only numerator retrieved, denominator will be set to one
        if (numbs.size() == 1) setUpNumDen(numbs.get(0), 1);
        // if both numerator and denominator retrieved
        else if (numbs.size() == 2) setUpNumDen(numbs.get(0), numbs.get(1));
    }


    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        // cast f to FractionImpl
        FractionImpl other = (FractionImpl) f;
        // calculate sum
        int denominator = this.denominator * other.denominator;
        int numerator = this.numerator * other.denominator + this.denominator * other.numerator;
        // return a new FractionImpl object
        return new FractionImpl(numerator, denominator);
    }


    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        // cast f to FractionImpl
        FractionImpl other = (FractionImpl) f;
        // calculate difference
        int denominator = this.denominator * other.denominator;
        int numerator = this.numerator * other.denominator - this.denominator * other.numerator;
        // return a new FractionImpl object
        return new FractionImpl(numerator, denominator);
    }


    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        // cast f to FractionImpl
        FractionImpl other = (FractionImpl) f;
        // calculate product
        int denominator = this.denominator * other.denominator;
        int numerator = this.numerator * other.numerator;
        // return a new FractionImpl object
        return new FractionImpl(numerator, denominator);
    }


    /**
     * Returns a new <pre>Fraction</pre> that is the <em>quotient</em> of dividing <pre>this</pre> by the parameter
     * <pre>(a/b) / (c/d)</pre> is <pre>(a*d)/(b*c)</pre>
     *
     * @param f the fraction to take part in the division
     * @return the result of the division
     * @exception ArithmeticException will be thrown if f is zero.
     */
    @Override
    public Fraction divide(Fraction f) {

        // cast f to FractionImpl
        FractionImpl other = (FractionImpl) f;

        // check if f is zero (ArithmeticException might be thrown)
        if (other.numerator == 0) throw new ArithmeticException("Divide by zero");
        else {
            // calculate quotient
            int denominator = this.denominator * other.numerator;
            int numerator = this.numerator * other.denominator;
            // return a new FractionImpl object
            return new FractionImpl(numerator, denominator);
        }
    }


    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        return new FractionImpl(Math.abs(numerator), this.denominator);
    }


    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        return new FractionImpl(-this.numerator, this.denominator);
    }


    /**
     * The inverse of <pre>a/b</pre> is <pre>b/a</pre>.
     *
     * @return the newly inverted fraction
     * @exception ArithmeticException will be thrown if trying to inverse a fraction with numerator being zero.
     */
    @Override
    public Fraction inverse() {
        return new FractionImpl(this.denominator, this.numerator);
    }


    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        // get the difference of this and o
        Fraction difference = this.subtract(o);
        // cast difference to FractionImpl
        FractionImpl result = (FractionImpl) difference;

        // if this < o
        if (result.numerator < 0) return -1;
        // if this == o
        else if (result.numerator == 0) return 0;
        // if this > o
        else return 1;
    }


    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        // check if obj is of Fraction class
        if (obj instanceof Fraction) {
            // cast obj to FractionImpl
            FractionImpl other = (FractionImpl) obj;
            // check equality
            if (this.numerator == other.numerator && this.denominator == other.denominator) return true;
            else return false;
        }
        else return false;
    }


    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        if (denominator == 1) return Integer.toString(numerator);
        else return numerator + "/" + denominator;
    }


    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

}