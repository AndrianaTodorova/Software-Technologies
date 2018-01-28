import java.util.LinkedHashMap;
import java.util.Scanner;

public class Problem_18_PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        short a = 3; // 0000 0011 = 3
//        short b = 5; // 0000 0101 = 5
//        System.out.println( a | b); // 0000 0111 = 7
//        System.out.println( a & b); // 0000 0001 = 1
//        System.out.println( a ^ b); // 0000 0110 = 6
//        System.out.println(~a & b); // 0000 0100 = 4
//        System.out.println(a << 1); // 0000 0110 = 6
//        System.out.println(a << 2); // 0000 1100 = 12
//        System.out.println(a >> 1); // 0000 0001 = 1
        String input = scanner.nextLine();
        String name;
        String number;
        LinkedHashMap<String, String> output = new LinkedHashMap<>();

        while (!input.equals("END")) {
            String[] inputArr = input.split(" ");
            name = inputArr[1];
            if (inputArr[0].equals("A")) {
                number = inputArr[2];
                output.put(name, number);
            } else {
                if (output.containsKey(name)) {
                    for (String key : output.keySet()) {
                        if (key.equals(name)) {
                            System.out.println(key + " -> " + output.get(key));
                            break;
                        }
                    }

                } else {
                    System.out.printf("Contact %s does not exist.%n", name);
                }
            }

            input = scanner.nextLine();

        }
    }
}
