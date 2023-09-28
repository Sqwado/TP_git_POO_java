public enum ArmorCategory {
    LIGHT(0.92F),
    MEDIUM(1.05F),
    HEAVY (1.12F);

    public float multiplicateur;

    private ArmorCategory(float multiplicateur) {
        this.multiplicateur = multiplicateur;
    }

    public float getMultiplicateur() {
        return multiplicateur;
    }
}
