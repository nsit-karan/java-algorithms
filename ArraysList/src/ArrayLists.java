import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        /*
         * - 10 is the initial capacity and not the max capacity
         * - can't have primitives as the type of the arraylist. has to be
         *   a proper class (in this case, wrapper classes for primitives)
         */
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println(arrayList);

    }
}
