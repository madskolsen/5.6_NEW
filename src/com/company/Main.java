package com.company;
import java.sql.SQLOutput; // TODO denne import bruges ikke
import java.util.Scanner;
public class Main {

    public static void calculate (double a, double b, double c){
        double divide = 2/a;
        double sqaure = Math.sqrt(Math.pow(b,2)-4*a*c);
        double root = Math.pow(b,2)-4*a*c;
        double xPlus = (-(b)+sqaure)/divide;
        double xMinus = (-(b)-sqaure)/divide;
        double plusresult = a*Math.pow(xPlus,2)+b*xPlus+c;
        double minusresult = a*Math.pow(xMinus,2)+b*xMinus+c;

        if (xPlus==xMinus){
            System.out.println("Der er kun en eller ingen løsning");
            System.out.println(xPlus);
        } else if (divide == 0){
            System.out.println("You cant divide by zero!");
        } else if (root<0){
            System.out.println("You cant take sqaureroot of a negative number!");
        } else {
            System.out.print("+ result: ");
            System.out.println(plusresult);
            System.out.print("- result: ");
            System.out.println(minusresult);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Angiv en a værdi: ");
        double a = scanner.nextDouble();
        System.out.println("Angiv en b værdi: ");
        double b = scanner.nextDouble();
        System.out.println("Angiv en c værdi: ");
        double c = scanner.nextDouble();
        calculate(a, b, c);
    }
}
