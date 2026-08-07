class Solution {
    public void reverseString(char[] s) {
        char temp;
        for (int i = s.length - 1; i >= s.length / 2; i--) {
            temp = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = temp;
        }
    }
}