class Solution {
    public List<String> commonChars(String[] words) {
    List<String> res = new ArrayList<>();
    if (words == null || words.length == 0) {
        return res;
    }
    int[] r = new int[26];
    char[] arr = words[0].toCharArray();
    for (char c : arr) {
        r[c - 'a']++;
    }
    for (int i = 1; i < words.length; i++) {
        int[] t = new int[26];
        char[] arrT = words[i].toCharArray();
        for (char c : arrT) {
            if (r[c - 'a'] == 0) {
                continue;
            }
            t[c - 'a']++;
        }
        update(r, t);
    }
    for (int i = 0; i < r.length; i++) {
        if (r[i] == 0) {
            continue;
        }
        for (int j = 0; j < r[i]; j++) {
            res.add(String.valueOf((char) ('a' + i)));
        }
    }
    return res;
}

void update(int[] r, int[] t) {
    for (int i = 0; i < r.length; i++) {
        r[i] = Math.min(r[i], t[i]);
    }
}
}