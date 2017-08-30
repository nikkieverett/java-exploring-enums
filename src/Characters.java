public enum Characters {

    ROUGE(true),
    WARRIOR(false),
    BARBARIAN(false),
    MAGE(true);

    private final Boolean canDoMagic;

    Characters(Boolean canDoMagic) {
        this.canDoMagic = canDoMagic;
    }
    public boolean canDoMagic() {
        return canDoMagic;
    }
}
