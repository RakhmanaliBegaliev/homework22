import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(100);
        for (int i = 1; i <= 50; i++) {
                numbers.add(i);
                System.out.println(i);
            }
        System.out.println();

        ArrayList<Integer> even = new ArrayList<Integer>();   // чётные
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i = 0; i<numbers.size(); i++){
            int x = numbers.get(i);
            if(x % 2 == 0)
                even.add(x);
            else
                odd.add(x);
        }
        System.out.println("четные: "+even);
        System.out.println();
        System.out.println("нечетные: "+odd);
    }
}
