package Syntax.lesson10_string;

public class StringDemo {
    public static void main(String[] args) {
       String strName="Dima";
       String strLastName=new String("Ten");
        System.out.println(strName+ " " +strLastName);
//        equals
        String firstString="Java";
        var secondString="java";
        System.out.println("Is two strings equals:" +firstString.equals(secondString));
        System.out.println("Is two strings equals(ignore case):" +firstString.equalsIgnoreCase(secondString));
//    получение размера строки
        System.out.println("The lenght of strName: " +strName.length());

//        получение подстроки
        String greeting ="Hello, World!";
        String substring=greeting.substring(
                greeting.indexOf("W"),//7
                greeting.indexOf("!") //12
        );
        System.out.println(substring);

//      проверка наличия подстроки
        String greetingwithUpperCase = greeting.toUpperCase();
        String greetingWithLowerCase = greeting.toLowerCase();
        System.out.println(greetingWithLowerCase);
        System.out.println("The string contains \"World\": "+greetingwithUpperCase.contains("world"));

//        удаление пробелов (trim)
        var login="     Dima_Ten   ";
        String loginAfterTrim=login.trim();
        System.out.println("loginAfterTrim:" +loginAfterTrim);
//  replace()
        var loginAfterReplace=login.trim().replace("_", ".");
        System.out.println("logingAfterReplace:" +loginAfterReplace);

//        StringBuffer- для многопоточного
        StringBuilder sb =new StringBuilder("   Hello,");
        sb.append("Ten");
        sb.append(" ");
        sb.append("Dima!    ");
                System.out.println(sb);



    }
}

