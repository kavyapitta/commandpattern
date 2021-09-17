public class PrepareStuffing implements Command {
    private Pillow pillow;
    private String type;

    public PrepareStuffing(Pillow pillow, String type) {
        this.pillow = pillow;
        this.type = type;
    }

    @Override
    public void execute() {
        System.out.println("Preparing " + type + " stuffing");
        Stuffing stuffing = null;
        if (type.equals("cotton")) {
            stuffing = new Cotton();
        } else if (type.equals("polyester")) {
            stuffing = new Polyester();
        }
        
        pillow.setStuffing(stuffing);
    }
}
