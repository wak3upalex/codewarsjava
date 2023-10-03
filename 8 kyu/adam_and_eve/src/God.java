public class God {
    public static Human[] create() {
        Human human_array[] = new Human[1];
        Man man1 = new Man();
        Woman woman1 = new Woman();
        human_array[0] = man1;
        human_array[1] = woman1;
        return human_array;
    }
}
