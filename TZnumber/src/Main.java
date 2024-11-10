import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        //get number from user
        int id = scan.nextInt();
        int k = 1;//to do the modulo
        int sum = 0;//get the sum from all numbers together
        int lhng = Integer.toString(id).length();
        for (int j = 0; j < lhng; j++) {
            if (j % 2 != 0 && lhng % 2 == 0) {
                sum += (id / k) % 10;
            } else {
                sum += getNumbers((id / k) % 10);
            }
            k *= 10;
        }
        System.out.println(id + "" + getBnumber(sum));
    }

    static public int getNumbers(int a) {
        int number;
        if (a >= 5) {
            a *= 2;
            return number = a / 10 % 10 + a % 10;
        } else {
            return number = a * 2;
        }
    }

    static public int getBnumber(int a) {
        int sum = 0;
         sum =(a / 10 % 10 + 1) * 10 - a;
       /* if (sum == 10) {
            sum %= 10;
        }*/
        return sum;
    }
}
