package org.apache.commons.lang;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IEEE754rUtilsTest {

    double[] mylist={5,4,3,2,1};
    double a=1,b=2,c=3;
    float d=4,e=5,f=6;
    IEEE754rUtils testcompare = new IEEE754rUtils();

    @Test
   public void TestDoublemin() {
        assertEquals(1.0,testcompare.min(a,b));
    }

    @Test
   public void TestArraymin() {
        assertEquals(1.0,testcompare.min(mylist));
    }

    @Test
   public void TestDoublemax() {
        assertEquals(4.0,testcompare.max(c,d));
    }

    @Test
    public void TestFloatmax() {
        assertEquals(6.0,testcompare.max(d,e,f));
    }
}