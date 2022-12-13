package lab02;

import java.util.Scanner;

public class Lab201 {
      public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height(m):");
        double height = scanner.nextDouble();

        System.out.print("Please enter your weight (kg):");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * 2);

        if (18.5 >= bmi)
        {
            System.out.print("Underweight\n,");
        }else if (bmi < 25)
        {
            System.out.print("Normal weight\n,");
        }else if (bmi < 30)
      {
            System.out.print("Overweight\n,");
        }else
        System.out.print("Obesity\n,");
    }
}

