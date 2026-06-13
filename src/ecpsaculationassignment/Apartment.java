package ecpsaculationassignment;

class Apartment {
    private int roomNumber;
    private double price;
    private boolean available;

    public Apartment(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.available = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void bookRoom() {
        available = false;
    }

    public void displayApartment() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Price: " + price + " THB");
        System.out.println("Available: " + available);
    }
}