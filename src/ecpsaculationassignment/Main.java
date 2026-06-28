package ecpsaculationassignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Apartment[] apartments = {
            new Apartment(101, 4500),
            new Apartment(102, 5000),
            new Apartment(103, 5500)
        };

        Booking[] bookings = new Booking[10];
        int bookingCount = 0;

        int choice;

        do {
            System.out.println("\n===== Apartment Booking System =====");
            System.out.println("1. Show Apartments");
            System.out.println("2. Book Apartment");
            System.out.println("3. Show Bookings");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("\n===== Apartment List =====");

                int i = 0;
                while (i < apartments.length) {
                    apartments[i].displayApartment();
                    System.out.println("----------------------");
                    i++;
                }

            } else if (choice == 2) {
                if (bookingCount >= bookings.length) {
                    System.out.println("Booking list is full.");
                } else {
                    System.out.print("Enter tenant name: ");
                    String name = input.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = input.nextLine();

                    System.out.print("Enter room number to book: ");
                    int roomNumber = input.nextInt();
                    input.nextLine();

                    Apartment selectedApartment = null;

                    int i = 0;
                    while (i < apartments.length) {
                        if (apartments[i].getRoomNumber() == roomNumber) {
                            selectedApartment = apartments[i];
                            break;
                        }
                        i++;
                    }

                    if (selectedApartment == null) {
                        System.out.println("Room not found.");
                    } else if (!selectedApartment.isAvailable()) {
                        System.out.println("Room is already booked.");
                    } else {
                        Tenant tenant = new Tenant(name, phone);

                        selectedApartment.bookRoom();

                        bookings[bookingCount] = new Booking(tenant, selectedApartment);
                        bookingCount++;

                        System.out.println("Apartment booked successfully!");
                        System.out.println("Your Tenant ID is: " + tenant.getTenantId());
                    }
                }

            } else if (choice == 3) {
                if (bookingCount == 0) {
                    System.out.println("No bookings found.");
                } else {
                    int i = 0;

                    while (i < bookingCount) {
                        bookings[i].displayBooking();
                        i++;
                    }
                }

            } else if (choice == 4) {
                System.out.println("Thank you for using the system.");

            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        input.close();
    }
}