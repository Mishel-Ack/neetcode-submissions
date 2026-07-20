class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String x : strs) {
            encoded.append(x.length()).append("#").append(x);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int hashIndex = str.indexOf('#', i);

            int length = Integer.parseInt(str.substring(i, hashIndex));

            int start = hashIndex + 1;
            int end = start + length;

            decoded.add(str.substring(start, end));

            i = end;
        }

        return decoded;
    }
}