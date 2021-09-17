public class PillowFactoryDriver {
    public static void main(String[] args) {
        OrderPillow orderPillow = new OrderPillow("back", "cotton", "white");
        orderPillow.execute();
        Pillow pillow = orderPillow.getPillow();
        System.out.println(pillow + " ready.\n");

        orderPillow = new OrderPillow("back", "cotton", "multicolor");
        orderPillow.execute();
        pillow = orderPillow.getPillow();
        System.out.println(pillow + " ready.\n");

        orderPillow = new OrderPillow("back", "polyester", "white");
        orderPillow.execute();
        pillow = orderPillow.getPillow();
        System.out.println(pillow + " ready.\n");

        orderPillow = new OrderPillow("side", "polyester", "multicolor");
        orderPillow.execute();
        pillow = orderPillow.getPillow();
        System.out.println(pillow + " ready.\n");

        orderPillow = new OrderPillow("stomach", "cotton", "white");
        orderPillow.execute();
        pillow = orderPillow.getPillow();
        System.out.println(pillow + " ready.\n");
    }
}
