class Solution {
    public boolean isMatch(String s, String p) {
         if (p.isEmpty()) {
            return s.isEmpty();
        }
        
         boolean firstMatch = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
        
    if (p.length() >= 2 && p.charAt(1) == '*') {
            // Two possibilities: skip the '*' and its preceding character, or match the character and check the remaining
            return (isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p)));
        } else {
            // If no '*', simply match the current character and check the remaining
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

}