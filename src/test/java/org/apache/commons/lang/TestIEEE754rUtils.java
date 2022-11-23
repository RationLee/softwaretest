package org.apache.commons.lang;

public class TestIEEE754rUtils {
    public static void main(String[] args)
    {
        double[] mylist={5,4,3,2,1};
        double a=1,b=2,c=3;
        float d=4,e=5,f=6;
        IEEE754rUtils testcompare = new IEEE754rUtils();
        System.out.println("a与b中较小者的值应为1.0，实为"+testcompare.min(a,b));
        System.out.println("数组mylist中最小者的值应为1.0，实为"+testcompare.min(mylist));
        System.out.println("b与c中较大者的值应为3.0，实为"+testcompare.max(b,c));
        System.out.println("d、e与f中较大者的值应为6.0，实为"+testcompare.max(d,e,f));
    }
}
