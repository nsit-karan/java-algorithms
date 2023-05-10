package com.search;

public class MaxWealthLeetCode {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,11},
                {22,33,44},
                {1,2,3,4,5},
                {11111,2,3,4,5}
        };
        System.out.println(maximumWealth(accounts));
        System.out.println(maximumWealthv2(accounts));

        System.out.println(maximumWealthTweaked(accounts));

    }

    /**
     * Leetcode - 1672
     * each row is the list of amount in diff accounts for 1 customer
     * find the max money that any customer has
     *
     * @param accounts
     * @return
     */
    public static int maximumWealth(int[][] accounts) {

        int maxCustSum = 0;
        for (int[] customerData : accounts) {
            int currentCustSum = 0;
            for (int account: customerData) {
                currentCustSum = currentCustSum + account;
            }

            if (currentCustSum > maxCustSum) {
                maxCustSum = currentCustSum;
            }
        }

        return maxCustSum;
    }

    /**
     *  is more optimal in terms of memory compared to the previous version - no clue why !!
     */
    public static int maximumWealthv2(int[][] accounts) {

        int maxCustSum = 0;
        for (int person = 0; person < accounts.length; person++) {
            int currentPerson = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                currentPerson += accounts[person][account];
            }

            if (maxCustSum < currentPerson) {
                maxCustSum = currentPerson;
            }
        }

        return maxCustSum;
    }

    /**
     * Leetcode - 1672 - tweaked
     * each row is the list of amount in diff accounts for 1 customer
     * find the customer having the max money
     *
     * @param accounts
     * @return
     */
    public static int maximumWealthTweaked(int[][] accounts) {

        int maxCustSum = 0;
        int custId = 0;
        for (int i = 0; i < accounts.length; i++) {
            int[] customerData = accounts[i];

            int currentCustSum = 0;
            for (int j = 0; j < customerData.length; j++) {
                currentCustSum = currentCustSum + accounts[i][j];
            }
            if (currentCustSum > maxCustSum) {
                maxCustSum = currentCustSum;
                custId = i;
            }

        }

        return custId;
    }
}
