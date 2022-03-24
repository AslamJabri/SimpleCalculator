package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SimpleCalculator calc = new SimpleCalculator();
        calc.setFirstNumber(5.25);
        calc.setSecondNumber(0);
        System.out.println("Addition : " + calc.getAdditionResult());
        System.out.println("Division : " + calc.getDivisionResult());
        System.out.println("Multiplication : " + calc.getMultiplicationResult());
        System.out.println("Substraction : " + calc.getSubstractionResult());
        System.out.println("Remiander : " + calc.getRemianderResult());
   //     System.out.println("Addition : " + calc.getAdditionResult());
    }
}
