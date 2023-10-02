import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Cats> arrayList = new ArrayList<>();
        ArrayList<Dogs> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(1,5);
            arrayList.add(new Cats("Cat"+i,a));
            arrayList1.add(new Dogs("Dog"+i,a));
        }
        System.out.println(arrayList1);
        System.out.println(arrayList);
    }
}