public enum WeaponType {

    SHORT(0.95F),
    LONG(1.0F),
    GREATSWORD (1.1F),
    KATANA (1.05F),
    BROADSWORD(1.0F),
    AXE(1.02F),
    HAMMER(1.05F);

    public float multiplicateur;

    private WeaponType( float multiplicateur) {
        this.multiplicateur = multiplicateur;
    }

    public float getMultiplicateur() {
        return multiplicateur;
    }
}

