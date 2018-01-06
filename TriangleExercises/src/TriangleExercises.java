import java.util.Scanner;

public class TriangleExercises {

    public static void main(String[] args){

        System.out.println("Welcome to Triangle Exercises");

        System.out.println("Choose how exercises do you want run:");

        System.out.println("1 - Easiest Ever");
        System.out.println("2 - Horizontal Line");
        System.out.println("3 - Vertical Line");
        System.out.println("4 - Right Triangle");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        int n = 1;

        switch (op){
            case 1 :
                System.out.print("Choose a number: ");
                easiestEver();
                break;

            case 2 :
                System.out.print("Choose a number: ");
                n = scanner.nextInt();
                horizontalLine(n);
                break;

            case 3 :
                System.out.print("Choose a number: ");
                n = scanner.nextInt();
                verticalLine(n);
                break;

            case 4 :
                System.out.print("Choose a number: ");
                n = scanner.nextInt();
                rightTriangle(n);
        }
    }

    static void easiestEver(){
        for (int i = 0; i<1; i++){
            System.out.println("*");
        }
    }

    static void horizontalLine(int n){
        for(int i = 0 ; i<n ; i++){
            System.out.print("*");
        }
    }

    static  void verticalLine(int n){
        for (int i = 0 ; i<n ; i++){
            System.out.println("*");
        }
    }

    static void rightTriangle(int n){
        for (int i = 1 ; i<=n ; i++) {
            System.out.println();
            for (int j=1 ; j<=i; j++){
                System.out.print("*");
            }
        }
    }
}