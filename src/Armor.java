public class Armor extends Equipement{

    private ArmorCategory category;
    private ArmorPiece armorPiece;

    public Armor(String name, Rarity rarity, int price) {
        super(name, rarity, price);
    }

    public ArmorCategory getCategory() {
        return category;
    }

    public void setCategory(ArmorCategory category) {
        this.category = category;
    }

    public void setArmorPiece(ArmorPiece armorPiece) {
        this.armorPiece = armorPiece;
    }

    public ArmorPiece getArmorPiece() {
        return armorPiece;
    }

    public Armor(String name, Rarity rarity, int price, ArmorCategory category, ArmorPiece armorPiece) {
        super(name, rarity, price);
        this.category = category;
        this.armorPiece = armorPiece;
    }

    public void changePrice(){
        this.setPrice((int) (this.getPrice() * this.getRarity().getMultiplicateur()));
    }

    public String toString(){
        System.out.println("Nom de l'armure : "+this.getName()+
                "\nCatégorie de l'armure : "+this.getCategory()+
                "\nPiece de l'armure : "+this.getArmorPiece()+
                "\nRareté de l'armure : "+this.getRarity()+
                "\nPrix de l'armure : "+this.getPrice());
        return null;
    }





}
