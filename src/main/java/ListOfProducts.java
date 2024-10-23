import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i <number ; i++) {
            String input = sc.nextLine();
            products.add(input);
        }

        Collections.sort(products);

        for (int i = 0; i <products.size() ; i++) {
            System.out.printf("%d.%s%n", i+1, products.get(i));;
        }
    }
}
