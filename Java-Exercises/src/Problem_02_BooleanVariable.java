import java.util.Scanner;

public class Problem_02_BooleanVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        boolean k = Boolean.parseBoolean(a);
        if (k){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
