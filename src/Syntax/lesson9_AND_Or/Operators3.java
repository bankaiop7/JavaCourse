package Syntax.lesson9_AND_Or;

public class Operators3 {
    public static void main(String[] args) {
        int a=5, b=5;

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
        System.out.println("Короче "+logicalAND);
        System.out.println("не короч "+logicalOR);
    }
}
