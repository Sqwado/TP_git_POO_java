public enum WeaponCategory {

    ONEHANDED(0.92F),
    TWOHANDED (1.15F);

    public float multiplicateur;

    private WeaponCategory(float multiplicateur) {
        this.multiplicateur = multiplicateur;
    }

    public float getMultiplicateur() {
        return multiplicateur;
    }
}
