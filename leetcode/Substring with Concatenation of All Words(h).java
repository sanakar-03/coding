 class Solution {
   
    public List<Integer> findSubstring(String s, String[] words) {
        int n = s.length();
        int m = words.length;
        int k = words[0].length();

        List<Integer> res = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();

        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        for (int offset = 0; offset < k; offset++) {
            Map<String, Integer> seen = new HashMap<>();
            int left = offset;
            int curLen = 0;

            for (int right = left; right + k <= n; right += k) {
                String word = s.substring(right, right + k);

                if (!count.containsKey(word)) {
                    seen.clear();
                    curLen = 0;
                    left = right + k;
                } else {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    curLen++;

                    while (seen.get(word) > count.get(word)) {
                        String leftWord = s.substring(left, left + k);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        curLen--;
                        left += k;
                    }

                    if (curLen == m) {
                        res.add(left);

                        String leftWord = s.substring(left, left + k);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        curLen--;
                        left += k;
                    }
                }
            }
        }
        return res;
    }
}