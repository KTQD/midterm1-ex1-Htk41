abstract class Item {
    public String name;
    private String description;
    protected String ID;
    float price;

    public Item(String name, String description, String ID, float price) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.price = price;
    }

    public abstract void showInfo();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}



