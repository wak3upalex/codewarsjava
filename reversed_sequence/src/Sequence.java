public class Sequence{
    public static int[] reverse(int n){
        int [] newReverse = new int[n];
        int i=0;
        for (int rev : newReverse){
            newReverse[i]=n;
            n--;
            i++;
        }
        return newReverse;
    }

}