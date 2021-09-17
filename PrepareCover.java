public class PrepareCover implements Command {
    private Pillow pillow;
    private String type;

    public PrepareCover(Pillow pillow, String type) {
        this.pillow = pillow;
        this.type = type;
    }
    
    @Override
    public void execute() {
        System.out.println("Preparing " + type + " cover");
        
        Cover cover = null;
        
        if (type.equals("multicolor")) {
            cover = new MultiColor();
        } else if (type.equals("white")) {
            cover = new White();
        }

        pillow.setCover(cover);
    }
}
