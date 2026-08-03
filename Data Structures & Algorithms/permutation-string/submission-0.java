class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int freq[] = new int[26];
        int freq2[] = new int[26];
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        int i = 0, j = 0;
        while (i < s2.length()) {
            freq2[s2.charAt(i++) - 'a']++;
            if (i - j >= s1.length()) {
                if (Arrays.equals(freq, freq2))
                    return true;
                freq2[s2.charAt(j++) - 'a']--;
            }
        }
        return false;
    }
}
