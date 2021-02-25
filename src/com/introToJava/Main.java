package com.introToJava;

public class Main
{
    public static void main(String[] args)
    {
	    // In this program we will implement two common algebraic forumulas in java.

        // First, let's go over some Math methods you will need in Lab 2b

        /*
         * Math.pow(base, exponent); = base^exponent
         *
         * @param {double} base - the number that is being raised to the power of exponent
         * @param {double} exponent - the power base is raised to
         *
         * @returns {double}
         */
        // example
        final double base = 5;
        final double exponent = 2;
        System.out.println("5 squared is equal to " + Math.pow(base, exponent));

        /*
         * Math.sqrt(double a); = sqrt(a)
         *
         * @param {double} a - the number to obtain the square root from
         *
         * @returns {double} (rounded) square root of a
         */
        // example
        final double areaOfSquare = 25d;
        final double lengthOfSide = Math.sqrt(areaOfSquare); // = 5d
        System.out.println(
                "The area of a square with sides that are "
                + lengthOfSide
                + " units long is "
                + areaOfSquare
                + " units squared."
        );

        // Now onto examples using our implemented formulas

        final double[ ] roots = quadraticFormula(1, -4, -12);
        System.out.println(
                "The roots of x^2 - 4 - 12 = 0 are "
                        + roots[0]
                        + " and "
                        + roots[1]
        );
        // d after an int literal makes it a double
        final double hypotenuse = pythagoreanTheorem(5d, 25d);
        // note: you can actually use the built in Math.hypot(a, b) instead of this method.
        System.out.println(
                "Given legs with lengths of 5 and 25 units, the hypotenuse would be "
                + hypotenuse
                + " units long"
        );
    }
    public static double[ ] quadraticFormula(final int a, final int b, final int c)
    {
        // here is where we will store our results
        final double[] roots = new double[2];

        // formula: x = ( -b +|- sqrt(b^2 - 4ac) ) / 2a

        // compute the discriminator
        final double discrim = Math.sqrt(Math.pow(b, 2) + (-4d * a * c));

        // here we store the roots in +|- form in our array ${roots}
        roots[0] = ((-1 * b) + discrim) / (2d * a);
        roots[1] = ((-1 * b) - discrim) / (2d * a);
        return roots;
    }
    public static double pythagoreanTheorem(final double a, final double b)
    {
        // formula: c = sqrt( a^2 + b^2 )
        return Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );
    }
    public static double monthlyPayment(final double principle, final double rate, final double months)
    {
        /*
         * r = rate
         * p = principal
         * n = # of months
         */
        // formula: p * ( (r * (1 + r)^n ) / ( (1 + r)^n - 1 )
        // cant implement it or it would be cheating to help on lab
        return 0d;
    }
}