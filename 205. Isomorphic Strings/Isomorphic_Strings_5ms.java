class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] sArr = new int[256];
        int[] tArr = new int[256];

        for (int i = 0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (sArr[c1] != tArr[c2]) return false;

            sArr[c1] = i + 1;
            tArr[c2] = i + 1;
        }

        return true;
    }
}