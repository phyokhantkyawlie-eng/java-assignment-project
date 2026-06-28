package ecpsaculationassignment;

class Tenant extends Person {
    private static int nextId = 1;
    private String tenantId;

    public Tenant(String name, String phone) {
        super(name, phone);
        this.tenantId = "T" + String.format("%03d", nextId);
        nextId++;
    }

    public String getTenantId() {
        return tenantId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Tenant ID: " + tenantId);
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
    }
}