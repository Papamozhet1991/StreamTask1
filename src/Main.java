import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intList2 = new ArrayList<>();

        for (Integer local : intList){
            if (local > 0 && local % 2 == 0){
                intList2.add(local);
            }
        }

        Collections.sort(intList2);

        for (Integer p : intList2){
            System.out.println(p);
        }
    }
}