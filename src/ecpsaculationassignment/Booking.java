package ecpsaculationassignment;

class Booking {
    private Tenant tenant;
    private Apartment apartment;

    public Booking(Tenant tenant, Apartment apartment) {
        this.tenant = tenant;
        this.apartment = apartment;
    }

    public void displayBooking() {
        System.out.println("\n===== Booking Detail =====");
        tenant.displayInfo();
        System.out.println("Room Number: " + apartment.getRoomNumber());
        System.out.println("Price: " + apartment.getPrice() + " THB");
        System.out.println("==========================");
    }
}