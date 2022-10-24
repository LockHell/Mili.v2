public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int amount = 15_036;
        int miles = service.calculate(amount);
        System.out.println(miles);
    }
}