import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mentés");

        Random random = new Random();
        int a = random.nextInt(6) +1;

        System.out.println(a);

        String s = "1";
        int i = Integer.parseInt(s);
        System.out.println(i);

        int g = 22;

        if (g ==0) {
            System.out.println("0");
        }
        else if (g ==1) {
            System.out.println("1");
        }
        else if (g ==2) {
            System.out.println("2");
        }
        else {
            System.out.println("más");
        }
        
        double[] es = {70, 22, 54, 98, 0};
        for (double egyen : es) {
            System.out.println(egyen);
        }

        ArrayList<String> nevek = new ArrayList<>();
        nevek.add("Bence");
        nevek.add("Márk");
    }
}
