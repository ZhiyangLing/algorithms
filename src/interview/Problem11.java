package interview;

/**
 * Created by lzy on 17-10-18.
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Problem11 {
    public boolean equal(double num1, double num2){
        if((num1 - num2 > -0.0000001) && (num1 - num2 < 0.0000001))
            return true;
        else
            return false;
    }
    public double Power(double base, int exponent) {
        if(equal(base, 0.0) && exponent < 0)
            return -1;
        if(exponent < 0)
            return 1/PowerWithInt(base,-exponent);
        else
            return PowerWithInt(base,exponent);
    }
    public double PowerWithInt(double base, int exponent){
        if(exponent == 0)
            return 1;
        if(exponent == 1)
            return base;
        double result = PowerWithInt(base,exponent >> 1);
        result *= result;
        if((exponent & 1) == 1)
            result *= base;
        return result;
    }

    public static void main(String[] args) {

    }
}
