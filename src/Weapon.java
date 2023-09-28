public class Weapon extends Equipement{

    private WeaponCategory category;
    private WeaponType weaponType;

    public WeaponCategory getCategory() {
        return category;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setCategory(WeaponCategory category) {
        this.category = category;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public Weapon(String name, Rarity rarity, int price, WeaponCategory category, WeaponType weaponType) {
        super(name, rarity, price);
        this.category = category;
        this.weaponType = weaponType;
    }

    public void changePrice(){
        this.setPrice((int) (this.getPrice() * this.getRarity().getMultiplicateur()));
    }

    public String toString(){
        System.out.println("Nom de l'arme : "+this.getName()+
                "\nCatégorie de l'arme : "+this.getCategory()+
                "\nType de l'arme : "+this.getWeaponType()+
                "\nRareté de l'arme : "+this.getRarity()+
                "\nPrix de l'arme : "+this.getPrice());
        return null;
    }
}
