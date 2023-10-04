import java.util.Random;

public class Ghost {
    public static String getColor(){
        Random random = new Random();
        int choiceOfColor = random.nextInt(4) +1;
        switch (choiceOfColor){
            case 1:
                return "white";
            case 2:
                return "yellow";
            case 3:
                return "purple";
            case 4:
                return "red";
        }
        return null;
    }
}