package Syntax.lesson8_operations;

public class Operators {
    public static void main(String[] args) {
        int a=4, b=8;
//оператор присваивания =

        b = a;
        //арифметические операторы
        int sum =a+b;
        int difference = b- a;
        int product= a * b;
        int quotient= a / b ;
        int remainder= a % b;
        a=a+1;
        a++;//инкрементирование (+1)
        a--;//декрементирование (-1)


        //a=a+4
        a += 4;
        b -= 2; //b= b-2;
        a*=4;
        b /=3;



        //операции сравнения
        boolean isEqyal= a == b;
        boolean isNotEqyal= a != b;
        boolean isGreater=a > b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLess= a < b;
        boolean isLessorEqual= a <= b;


    }
}
