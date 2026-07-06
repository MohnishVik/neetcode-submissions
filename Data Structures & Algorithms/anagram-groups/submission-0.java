class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        boolean[] used = new boolean[strs.length];
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {

            if (used[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    used[j] = true;
                }
            }

            result.add(group);
        }

        return result;
    }

    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] as = a.toCharArray();
        char[] bs = b.toCharArray();

        Arrays.sort(as);
        Arrays.sort(bs);

        return Arrays.equals(as, bs);
    }
}
