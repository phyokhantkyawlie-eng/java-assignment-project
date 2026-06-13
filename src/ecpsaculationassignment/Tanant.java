package ecpsaculationassignment;

class Tenant extends Person {
    private String tenantId;

    public Tenant(String name, String phone, String tenantId) {
        super(name, phone);
        this.tenantId = tenantId;
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