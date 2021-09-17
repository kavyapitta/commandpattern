public class CreatePillow implements Command{
    private Pillow pillow;
    private String stuffing;
    private String cover;

    public CreatePillow(Pillow pillow, String stuffing, String cover) {
        this.pillow = pillow;
        this.stuffing = stuffing;
        this.cover = cover;
    }

    @Override
    public void execute() {
        String name = pillow.getName();
        System.out.println("Creating " + name);
        
        PrepareStuffing prepareStuffing = new PrepareStuffing(pillow, stuffing);
        prepareStuffing.execute();

        PrepareCover prepareCover = new PrepareCover(pillow, cover);
        prepareCover.execute();
    }
}
