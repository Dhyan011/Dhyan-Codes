class Solution {
    public boolean checkDivisibility(int n) {

        int original = n;
        int sum = 0;
        int product = 1;

        while (n > 0) {

            int digit = n % 10;

            sum += digit;
            product *= digit;

            n = n / 10;
        }

        int x = sum + product;

        if (original % x == 0) {
            return true;
        } else {
            return false;
        }
    }
}