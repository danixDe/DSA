class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> te = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            te.add(String.valueOf(i));
        }
        Collections.sort(te);
        List<Integer> res = new ArrayList<>();
        for (String s : te) {
            res.add(Integer.parseInt(s));
        }
        return res;
    }
}
