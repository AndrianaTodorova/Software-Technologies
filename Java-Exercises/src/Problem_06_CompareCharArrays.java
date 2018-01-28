package CompareCharArrays;


import java.util.Scanner;

public class Problem_06_CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split("\\s");
        String[] secondArr = scanner.nextLine().split("\\s");
        int shortestArr = Math.min(firstArr.length,secondArr.length);

        String[] arrOne;
        String[] arrTwo;
        boolean isArrOneFirst = false;
        boolean isArrSecondFirst = false;

        for (int i = 0; i < shortestArr; i++) {
            if (firstArr[i].charAt(0) < secondArr[i].charAt(0)){
                isArrOneFirst=true;
                break;

            }
            if (firstArr[i].charAt(0) > secondArr[i].charAt(0)){
                isArrSecondFirst = true;
                break;
            }
            if (firstArr[i].charAt(0) != secondArr[i].charAt(0)){
                break;
            }
        }
        if (isArrOneFirst){
            arrOne = firstArr;
            arrTwo = secondArr;

        }
        else if (isArrSecondFirst){
            arrOne = secondArr;
            arrTwo = firstArr;
        }
        else {
            arrOne = firstArr;
            arrTwo = secondArr;

            if (firstArr.length >= secondArr.length) {
                arrOne = secondArr;
                arrTwo = firstArr;
            }
        }

        System.out.println(String.join("", arrOne));
        System.out.println(String.join("", arrTwo));

    }
}
