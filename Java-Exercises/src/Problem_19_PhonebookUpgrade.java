import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem_19_PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String name;
        String number;
        TreeMap<String, String> output = new TreeMap<>();

        while (!input.equals("END")) {
            String[] inputArr = input.split(" ");


            if (inputArr[0].equals("A")) {
                name = inputArr[1];
                number = inputArr[2];
                output.put(name, number);
            } else if(inputArr[0].equals("S")) {
                name = inputArr[1];
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
                else if (inputArr[0].equals("ListAll")) {

                    for (String key : output.keySet()) {

                        System.out.println(key + " -> " + output.get(key));
                    }
            }

            input = scanner.nextLine();

        }
    }
}