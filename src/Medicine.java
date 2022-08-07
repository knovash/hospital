public class Medicine {
    //Fields
    private String name;
    private int price;
    private int quantity;


    //Constructors
    public Medicine(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Methods

    public void storeMedicine(int quantity) {
        this.quantity = quantity;
        System.out.println("Take medicine");
    }

    public String print() {
        String text = (this.name + " " + this.price + " " + this.quantity);
        return text;
    }

    // Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }
}