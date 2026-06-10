package librarysystem;

import javax.swing.JOptionPane;

public class LibrarySystem {

    public static void main(String[] args) {

        LibraryItem[] items = new LibraryItem[100];

        int count = 0;
        boolean running = true;

        JOptionPane.showMessageDialog(null, "Start run");

        while (running) {

            String menu = """
                    1. Create
                    2. Delete
                    3. Show All Lists
                    4. Logout
                    """;

            String choiceText = JOptionPane.showInputDialog(menu);

            if (choiceText == null) {
                break;
            }

            int choice = Integer.parseInt(choiceText);

            if (choice == 1) {

                String typeText = JOptionPane.showInputDialog("""
                        Choose Library Item
                        
                        1. Book
                        2. Magazine
                        3. DVD
                        """);

                if (typeText == null) {
                    continue;
                }

                int type = Integer.parseInt(typeText);

                String totalText = JOptionPane.showInputDialog("How many items do you want to create?");
                int total = Integer.parseInt(totalText);

                for (int i = 0; i < total; i++) {

                    String code = JOptionPane.showInputDialog("Enter item code:");
                    String title = JOptionPane.showInputDialog("Enter item title:");

                    if (type == 1) {

                        String author = JOptionPane.showInputDialog("Enter book author:");

                        Book book = new Book(code, title, author);
                        items[count] = book;
                        count++;

                        JOptionPane.showMessageDialog(null, "Book created!");

                    } else if (type == 2) {

                        String issueNumber = JOptionPane.showInputDialog("Enter magazine issue number:");

                        Magazine magazine = new Magazine(code, title, issueNumber);
                        items[count] = magazine;
                        count++;

                        JOptionPane.showMessageDialog(null, "Magazine created!");

                    } else if (type == 3) {

                        String duration = JOptionPane.showInputDialog("Enter DVD duration:");

                        DVD dvd = new DVD(code, title, duration);
                        items[count] = dvd;
                        count++;

                        JOptionPane.showMessageDialog(null, "DVD created!");

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid item type!");
                    }
                }

            } else if (choice == 2) {

                String deleteCode = JOptionPane.showInputDialog("Enter item code to delete:");

                boolean found = false;

                for (int i = 0; i < count; i++) {

                    if (items[i].getCode().equals(deleteCode)) {

                        for (int j = i; j < count - 1; j++) {
                            items[j] = items[j + 1];
                        }

                        items[count - 1] = null;
                        count--;

                        found = true;
                        break;
                    }
                }

                if (found) {
                    JOptionPane.showMessageDialog(null, deleteCode + " deleted successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "This item is not available!");
                }

            } else if (choice == 3) {

                String output = "===== Library Item List =====\n\n";

                if (count == 0) {
                    output += "No items available.";
                } else {
                    for (int i = 0; i < count; i++) {
                        output += "Item " + (i + 1) + "\n";
                        output += items[i].showInfo();
                        output += "\n----------------------\n";
                    }
                }

                JOptionPane.showMessageDialog(null, output);

            } else if (choice == 4) {

                JOptionPane.showMessageDialog(null, "Logout successful!");
                running = false;

            } else {

                JOptionPane.showMessageDialog(null, "Invalid choice!");
            }
        }
    }
}