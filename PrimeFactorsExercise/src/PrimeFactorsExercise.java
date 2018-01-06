import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PrimeFactorsExercise {

    static List<Integer> list;
    public static void main(String[] args){

        System.out.print("Choose a number: ");
        list = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        generate(n);

        System.out.println(list);
    }

    public static void generate (int n){
        boolean flag = false;
        int divisor = 3;

        do {
            if (n%2 == 0) {
                list.add(2);
                n = n/2;
            }
            else
                flag = true;
        }
        while (flag == false);

        if (n >= 3) {
            do {
                while (n%divisor != 0)
                    divisor = divisor+2;

                list.add(divisor);
                n = n/divisor;
            }
            while(!(n==1));
        }
    }
}
