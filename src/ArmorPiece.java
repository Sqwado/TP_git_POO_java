public enum ArmorPiece {
    HELMET(0.98F),
    CHESTPLATE(1.12F),
    GAUNTLETS (0.95F),
    LEGGINGS (1.05F);

    public float multiplicateur;

    private ArmorPiece(float multiplicateur) {
        this.multiplicateur = multiplicateur;
    }

    public float getMultiplicateur() {
        return multiplicateur;
    }
}
