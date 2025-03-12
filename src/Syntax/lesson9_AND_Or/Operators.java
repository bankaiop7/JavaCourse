package Syntax.lesson9_AND_Or;

public class Operators {
    public static void main(String[] args) {
        int a=10, b=3;

        //операции сравнения
        boolean isEqyal= a == b;
        boolean isNotEqyal= a != b;
        boolean isGreater=a > b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLess= a < b;
        boolean isLessorEqual= a <= b;

        //And(&&) OR(||)
        boolean aIsGreaterThanB = a > b; //true
        boolean aIsEqualOfB =a ==b; //false
        //Конъюнкция
        boolean logicalAND=aIsGreaterThanB && aIsEqualOfB;
        //Дизъюнкция
        boolean logicalOR=aIsGreaterThanB || aIsEqualOfB;
        //Дизъюнкция
        System.out.println("The result of expression: 10>3 AND 10==3 is "+logicalAND);
        System.out.println("The result of expression: 10>3 AND 10==3 is "+logicalOR);
    }
}
