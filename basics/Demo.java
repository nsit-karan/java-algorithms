/**
 * Very basic code stub which iterates over the command line arguments and dumps content on the screen
 * args.lenth - not a function - to get the length of the args array
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("hello world!");

        System.out.println("Now printing all command line arugments as-is");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
