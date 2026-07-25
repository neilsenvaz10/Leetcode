class Solution {
    public double myPow(double base, int exponent)
    {
        long longExponent = exponent;
        
        if (longExponent < 0)
        {
            return 1.0 / recursivePow(base, -longExponent);
        }
        return recursivePow(base, longExponent);
    }

    private double recursivePow(double base, long exponent) {
        if (exponent == 0) return 1.0; 
        if (exponent == 1) return base; 

        double half = recursivePow(base, exponent / 2);

        if (exponent % 2 == 0)
        {
            return half * half;
        } 
        else
        {
            return half * half * base;
        }
    }
}
