import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intList2 = new ArrayList<>(intList);
        Iterator<Integer> iterator = intList2.iterator();

        while(iterator.hasNext()){
            Integer local = iterator.next();
            if (local <= 0){
                iterator.remove();
            }
        }

        for (int i=0; i<intList2.size();i++){
            int even = intList2.get(i)%2;
            if (even != 0) {
                intList2.remove(i);
                i--;
            }
        }

        Collections.sort(intList2);

        for (Integer p : intList2){
            System.out.println(p);
        }
    }
}