package UnitP4.PhotoAlbum;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        PhotoAlbum pa = new PhotoAlbum();
        int input = 1;

        while (input != 0) {
            System.out.println("Photo Album Apps");
            System.out.println("1 - Add Photo");
            System.out.println("2 - Get all Photos by Category");
            System.out.println("3 - Sort by Photo size");
            System.out.println("4 - Search Photo by ID");
            System.out.println("0 - Quit");
            System.out.print(">> ");
            input = kb.nextInt();
            kb.nextLine();
            System.out.println("");

            if (input == 1) {
                System.out.print("Enter photo ID: ");
                String id = kb.nextLine();
                System.out.print("Enter photo category: ");
                String cat = kb.nextLine();
                System.out.print("Enter photo size: ");
                double size = kb.nextDouble();
                kb.nextLine();
                Photo np = new Photo(id, cat, size);
                boolean added = pa.add(np);
                if (added) {
                    System.out.println("---> Photo successfully added");
                } else {
                    System.out.println("---> No more space available for Photos");
                }
                System.out.println("");

            } else if (input == 2) {
                System.out.print("Enter search Category: ");
                String cat = kb.nextLine();
                System.out.println("");
                System.out.println("Photos in category " +cat+ ": ");
                pa.list(cat);
                System.out.println("");

            } else if (input == 3) {
                System.out.println("PhotoAlbum will be sorted by size");
                pa.sort();
                System.out.println("");

            } else if (input == 4) {
                System.out.print("Enter Photo ID: ");
                String search = kb.nextLine();
                System.out.println("");
                Photo found = pa.search(search);
                if (found != null) {
                    System.out.println("Photo found!");
                    System.out.format("%-20s %-15s %-20s",
                            "Photo ID", "Size", "Category\n");
                    System.out.println(found);
                } else {
                    System.out.println("Photo not found...");
                }
                System.out.println("");

            } else if (input == 0) {
                System.out.println("Goodbye. ");
            }

        }
    }
}
