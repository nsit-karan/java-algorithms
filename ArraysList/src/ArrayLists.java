import java.util.ArrayList;
import java.util.Scanner;

/**
 * An arraylist internally is an array - so pretty efficient in terms of
 * insertion/retrieval
 *
 * it achieves avoiding a fixed size as input by resizing the array when filled up
 * for instance, if it starts with size X and if that fills up, its going to initialize
 * a bigger size array (say X+delta) and keep using it and regrow as needed
 */
public class ArrayLists {

    public static void multiArrayList() {
        System.out.println("Input nos for multi-d array lists");
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multiArrayList = new ArrayList<>();

        /*
         * initialize the inner array list. be default, its null
         * here, we initialize till 3 only (can be anything)
         * this isn't the standard way to initialize multi-d array list.
         * just an eg
         */
        for (int i = 0; i < 3; i++) {
            multiArrayList.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // get the arraylist at ith index and add elements to it
                multiArrayList.get(i).add(scanner.nextInt());
            }
        }

        // will print [[1,2,3], [4,5,6], [7,8,9]]
        System.out.println(multiArrayList);

    }

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

        // check for presence of element
        System.out.println("Array to being with " + arrayList.contains(10));

        // set an element at an index
        arrayList.set(0, 999);

        // remove element at a particular index
        arrayList.remove(2);

        // get an element at a particular indix
        System.out.println(arrayList.get(2));
        System.out.println("Array post all modifications" + arrayList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input nos to be pushed to the array");
        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextInt());
        }

        System.out.println("Array at the end : " + arrayList);

        // multi array lists
        multiArrayList();
    }
}
