///Assignment #4: Convert Minutes to Seconds


import java.util.Scanner;

public class LabFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();


        int seconds = minutes * 60;


        System.out.println(minutes + " minutes is equivalent to " + seconds + " seconds.");


        scanner.close();
    }
}

