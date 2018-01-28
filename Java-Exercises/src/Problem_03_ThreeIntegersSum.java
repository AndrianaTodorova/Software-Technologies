import java.util.Scanner;

public class Problem_03_ThreeIntegersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (!checkSum(first,second,third) &&
                !checkSum(third,first,second)&&
                !checkSum(second,third,first)){
            System.out.println("No");
        }


    }
    public static boolean checkSum(int first, int second, int third){
        if(first + second != third){
            return false;
        }
        if (first <= second){
            System.out.printf("%d + %d = %d%n", first, second, third);
        }
        else{
            System.out.printf("%d + %d = %d%n", second, first, third);
        }
        return true;
    }
}
