public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship(0, 0);
        System.out.println(ship.isWorthIt());
        ship = new Ship(40, 5);
        System.out.println(ship.isWorthIt());
    }
}