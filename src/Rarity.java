public enum Rarity {
    COMMON(1.0F),
    UNCOMMON(1.05F),
    RARE (1.1F),
    EPIQUE (1.15F),
    LEGENDARY(1.2F);

    public float multiplicateur;

    private Rarity( float multiplicateur) {
        this.multiplicateur = multiplicateur;
    }

    public float getMultiplicateur() {
        return multiplicateur;
    }
}
