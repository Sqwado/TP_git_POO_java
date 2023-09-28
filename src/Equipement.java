
public class Equipement {

    protected  String name;
    protected Rarity rarity;
    protected int price;

    public Equipement(String name, Rarity rarity, int price)  {
        this.name = name;
        this.rarity = rarity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
