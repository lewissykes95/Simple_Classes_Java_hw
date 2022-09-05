public class Runner {

    public static void main(String[] args) {
        WaterBottle BigBottle = new WaterBottle(100);
        System.out.println(BigBottle.drink());
        System.out.println(BigBottle.drink());
        System.out.println(BigBottle.drink());
        System.out.println(BigBottle.fillBottle());
        System.out.println(BigBottle.drink());
        System.out.println(BigBottle.emptyBottle());
    }

}