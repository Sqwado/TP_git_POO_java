import java.util.ArrayList;

public class Merchant {

    private String name;
    private ArrayList<Equipement> inventory;
    private int money;


    public Merchant(String name, ArrayList<Equipement> inventory, int money) {
        this.name = name;
        this.inventory = inventory;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Equipement> getInventory() {
        return inventory;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInventory(ArrayList<Equipement> inventory) {
        this.inventory = inventory;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    


}
