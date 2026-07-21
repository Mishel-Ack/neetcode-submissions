class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder str = new StringBuilder(s);

        return s.equals(str.reverse().toString());
    }
}