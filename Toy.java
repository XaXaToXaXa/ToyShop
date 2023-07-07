public class Toy {
    private final int id;
    private final String name;
    private int amount;
    private int weight;

    public Toy(int id, String name, int amount, int weight) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.weight = weight;
    }
    public Toy(int id, String name) {
        this.id = id;
        this.name = name;
    }

   public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "\nИгрушка " +
                "№ " + id +
                ", '" + name + '\'' +
                ", количество: " + amount +
                ", вес: " + weight + " гр.";
    }
}
