class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) 
    {
        for (int i = 0; i < triplets.length; i++) {
            int a=triplets[i][0];
            int b=triplets[i][1];
            int c=triplets[i][2];
            for (int j = 0; j < triplets.length; j++) {
                if (triplets[j][0] <= target[0] &&
                    triplets[j][1] <= target[1] &&
                    triplets[j][2] <= target[2]) 
                    {
                        a = Math.max(a, triplets[j][0]);
                        b = Math.max(b, triplets[j][1]);
                        c = Math.max(c, triplets[j][2]);
                }
            }
            if (a == target[0] &&
                b == target[1] &&
                c == target[2]) {
                return true;
            }
        }
        return false;
    }
}