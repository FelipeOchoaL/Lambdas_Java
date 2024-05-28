public class LambdasTwo {
    interface NumericTest{
        boolean test(int n, int b);
    }

    public static void main(String[] args) {
        // This lambda expression determines if one number is a factor of the other
        NumericTest isFactor = (n,d) -> (n%d) == 0;

        if(isFactor.test(20,2))
            System.out.println("2 is factor of 20");
        if(!isFactor.test(20,3))
            System.out.println("3 is not a factor of 20");
        System.out.println();


        //This expression returns true if the first argument is less than the second
        NumericTest lessThan = (n,m) -> (n<m);
        if(lessThan.test(48,6))
            System.out.println("6 is less than 48");
        if(!lessThan.test(48,6))
            System.out.println("48 is not less than 6");
        System.out.println();


        //This lambda expression returns true if the absolute values of the arguments are equal
        NumericTest numEqual = (n,m) -> (n<0?-n:n) == (m<0?-m:m);
        if(numEqual.test(20, -20))
            System.out.println("20 and -20 have the same absolute value");
        if(!numEqual.test(24,20))
            System.out.println("24 and 20 dont have the same absolute value");
        System.out.println();


    }

}
