package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();
        Scanner scanner = new Scanner(System.in);

        store.addToy(new Toy(1, "Doll", 5, 20));
        store.addToy(new Toy(2, "Car", 10, 40));
        store.addToy(new Toy(3, "Teddy bear", 3, 10));

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a new toy");
            System.out.println("2. Update toy weight");
            System.out.println("3. Draw a prize toy");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("Enter toy id:");
                int id = scanner.nextInt();
                System.out.println("Enter toy name:");
                String name = scanner.next();
                System.out.println("Enter toy quantity:");
                int quantity = scanner.nextInt();
                System.out.println("Enter toy weight:");
                double weight = scanner.nextDouble();
                store.addToy(new Toy(id, name, quantity, weight));
            }
            else if (option == 2) {
                System.out.println("Enter toy id:");
                int id = scanner.nextInt();
                System.out.println("Enter toy weight:");
                double weight = scanner.nextDouble();
                store.updateWeight(id, weight);
            }
            else if (option == 3) {
                Toy prizeToy = store.getPrizeToy();
                if (prizeToy != null) {
                    System.out.println("Congratulations! You won a " + prizeToy.getName() + ".");
                }
                else {
                    System.out.println("Sorry, there are no more prize toys left.");
                }
            }
            else if (option == 4) {
                break;
            }
        }
    }
}