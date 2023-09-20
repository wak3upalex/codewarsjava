public class CounterSheeps {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        if (arrayOfSheeps == null) {
            return 0;
        }

        int counter = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            Boolean sheep = arrayOfSheeps[i];
            if (sheep != null && sheep == true) {
                counter++;
            }
        }
        return counter;
    }
}
