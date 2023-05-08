package com.search;

public class SearchStrings {

    /**
     * one of the impl - iterate and use charAt to get the char and match
     *
     * @param str
     * @param target
     * @return
     */
    public static boolean searchString1(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Another impl which used str.toCharArray to convert
     * to char array and then use for-each to directly
     * compare the char with target and return accordingly
     *
     * @param str
     * @param target
     * @return
     */
    public static boolean searchString2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "Harry Potter";

        // returns true since P exists
        System.out.println(searchString1(s, 'P'));
        System.out.println(searchString2(s, 'P'));

        // returns false since Y does't exist
        System.out.println(searchString1(s, 'Y'));
        System.out.println(searchString2(s, 'Y'));

    }
}
