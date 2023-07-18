public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String ans="";
        for (int i = 1; i<=repeat;i++){
            ans += string;
        }
        return ans ;
    }
}
