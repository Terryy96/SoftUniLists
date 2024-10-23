import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManupulationsAdvanced {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String line = sc.nextLine();

            if (line.equals("end")) {
                break;
            }
            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Contains":
                    int numberToContain = Integer.parseInt(tokens[1]);
                    if (numbers.contains(numberToContain)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (tokens[1].equals("even")) {
                        for (int i : numbers) {
                            if (i % 2 == 0) {
                                System.out.print(i + " ");
                            }
                        }
                        System.out.println();
                    } else if (tokens[1].equals("odd")) {
                        for (int i : numbers) {
                            if (i % 2 != 0) {
                                System.out.print(i + " ");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "Get":
                    int sum = 0;
                    for (int n : numbers) {
                        sum += n;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = tokens[1];
                    int filterNumber = Integer.parseInt(tokens[2]);
                    switch (condition) {
                        case "<":
                            for (int num : numbers) {
                                if (num < filterNumber) {
                                    System.out.print(num + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int num : numbers) {
                                if (num > filterNumber) {
                                    System.out.print(num + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int num : numbers) {
                                if (num >= filterNumber) {
                                    System.out.print(num + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int num : numbers) {
                                if (num <= filterNumber) {
                                    System.out.print(num + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
            }
        }
    }
}
