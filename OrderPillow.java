public class OrderPillow implements Command {
    private String type;
    private Pillow pillow;
    private String stuffing;
    private String cover;

    public OrderPillow(String type, String stuffing, String cover) {
        this.pillow = null;
        this.type = type;
        this.stuffing = stuffing;
        this.cover = cover;
    }

    @Override
    public void execute() {
        if (type.equals("back")) {
            pillow = new BackPillow("Back Pillow");
        } else if (type.equals("side")) {
            pillow = new SidePillow("Side Pillow");
        } else if (type.equals("stomach")) {
            pillow = new StomachPillow("Stomach Pillow");
        }
        
        CreatePillow createPillow = new CreatePillow(pillow, stuffing, cover);
        createPillow.execute();
    }

    public Pillow getPillow() {
        return pillow;
    }
}
