package com.company;

public class Main
{
    public static void main(String[] args)
    {
        //Tests with Default constructor.
        Quad quadratic1 = new Quad();

        quadratic1.getA();

        quadratic1.getB();

        quadratic1.getC();

        String output1 = quadratic1.toString();
        System.out.println(output1);

        quadratic1.isNegative();

        quadratic1.hasRealRoots();

        quadratic1.firstDeriv(1.0);

        quadratic1.computeRoots();

        //Tests with a set to 0
        Quad quadratic2 = new Quad(0, -10 , 5);
        quadratic2.getA();

        quadratic2.getB();

        quadratic2.getC();

        String output2 = quadratic2.toString();
            System.out.println(output2);

        quadratic2.isNegative();

        quadratic2.hasRealRoots();

        quadratic2.firstDeriv(1.0);

        quadratic2.computeRoots();

        //Test with disc
        Quad quadratic3 = new Quad(10, -15, -20);

        quadratic3.getA();

        quadratic3.getB();

        quadratic3.getC();

        String output3 = quadratic3.toString();
            System.out.println(output3);

        quadratic3.isNegative();

        quadratic3.hasRealRoots();

        quadratic3.firstDeriv(1.0);

        quadratic3.computeRoots();
    }
}