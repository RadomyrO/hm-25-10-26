package part4_pizza;

import java.util.Scanner;

public class Part4Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        // 4.2. Input arrays
        int[] prices = new int[n];
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Pizza " + (i + 1) + " name: ");
            names[i] = sc.nextLine();
            System.out.print("Pizza " + (i + 1) + " price: ");
            prices[i] = Integer.parseInt(sc.nextLine().trim());
        }

        // 4.3. Pizza array
        Pizza[] pizzas = new Pizza[n];
        for (int i = 0; i < n; i++) {
            pizzas[i] = new Pizza(names[i], prices[i]);
        }

        // 4.4. Sort by price (bubble)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (pizzas[j].getPrice() > pizzas[j + 1].getPrice()) {
                    Pizza tmp = pizzas[j];
                    pizzas[j] = pizzas[j + 1];
                    pizzas[j + 1] = tmp;
                }
            }
        }

        // 4.5. Output
        System.out.println("--- Sorted by price ---");
        for (Pizza p : pizzas) {
            System.out.println(p.info());
        }
    }
}
