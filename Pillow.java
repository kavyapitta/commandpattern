public abstract class Pillow {
    private String name;
    private Stuffing stuffing;
    private Cover cover;

    public Pillow(String name) {
        this.name = name;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public void setStuffing(Stuffing stuffing) {
        this.stuffing = stuffing;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " with " + stuffing + " stuffing in " + cover + " pillow cover";
    }
}
