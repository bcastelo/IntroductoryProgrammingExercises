import java.util.Scanner;

public class DiamondExercises {

    public static void main(String[] args){

        System.out.println("Welcome to Diamond Exercises");

        System.out.println("Choose how exercises do you want run:");

        System.out.println("1 - Isosceles Triangle");
        System.out.println("2 - Diamond");
        System.out.println("3 - Diamond with Name");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        int n = 1;

        switch (op){
            case 1 :
                System.out.print("Choose a number: ");
                n = scanner.nextInt();
                isoscelesTriangle(n);
                break;

            case 2 :
                System.out.print("Choose a number: ");
                n = scanner.nextInt();
                diamond(n);
                break;

            case 3 :
                System.out.print("Choose a number: ");
                n = scanner.nextInt();
                diamondWithName(n);
                break;
        }
    }

    static void isoscelesTriangle(int n){
        int countSpace = n;
        for (int i = 0 ; i < 2*n ; i=i+2){
            for (int j = countSpace ; j>=0 ; j--){
                System.out.print(" ");
            }
            if(i == 1){
                System.out.print("*");
            } else {
                for (int k = 1 ; k < i + 2; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
            countSpace=countSpace-1;
        }
    }

    static void diamond(int n){
        int countSpace = n;
        int i;
        for (i = 0 ; i < 2*n ; i=i+2){
            for (int j = countSpace ; j>=0 ; j--){
                System.out.print(" ");
            }
            if(i == 1){
                System.out.print("*");
            } else {
                for (int k = 1 ; k < i + 2; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
            countSpace=countSpace-1;
        }

        countSpace = countSpace + 2;

        while(i > 0){
            for (int j = countSpace; j >= 0; j--) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print("*");
            } else {
                for (int k = 1; k < i - 2; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
            countSpace = countSpace + 1;
            i=i-2;
        }
    }

    static void diamondWithName(int n){
        int countSpace = n;
        int i;
        for (i = 0 ; i < 2*n ; i=i+2){
            for (int j = countSpace ; j>=0 ; j--){
                System.out.print(" ");
            }

            if(i+2<2*n) {
                if (i == 1) {
                    System.out.print("*");
                } else {
                    for (int k = 1; k < i + 2; k++) {
                        System.out.print("*");
                    }
                }
            } else {
                System.out.print("Bruna");
            }
            System.out.println();
            countSpace=countSpace-1;
        }

        countSpace = countSpace + 2;

        while(i > 0){
            for (int j = countSpace; j >= 0; j--) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print("*");
            } else {
                for (int k = 1; k < i - 2; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
            countSpace = countSpace + 1;
            i=i-2;
        }
    }

    /*static void diamondWithName(int n){
        int countSpace = n;
        int i;
        int countP=1;
        for (i = 1 ; i <= n ; i++){
            for (int j = countSpace ; j>=0 ; j--){
                System.out.print("1");
            }
            if(i == 1){
                System.out.print("*");
            }
            else {
                for (int k = 1 ; k < countP; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
            countSpace=countSpace-1;
            countP=countP+2;
        }

         = countSpace + 2;

        while(i > 0){
            for (int j = countSpace; j >= 0; j--) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print("*");
            } else {
                for (int k = 1; k < i - 2; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
            countSpace = countSpace + 1;
            i=i-2;
        }
    }*/
}