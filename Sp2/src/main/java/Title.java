public abstract class Title {
    protected String title;
    protected String literatureType;
    protected int copies;
    protected double rate = 0.067574;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    public abstract double calculatePoints();

    protected double calculateLiteraturePoints() {
        switch (literatureType) {
            case "BI":
                return 3;
            case "TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
            default:
                throw new IllegalArgumentException("Unknown literature type: " + literatureType);
        }
    }
}
