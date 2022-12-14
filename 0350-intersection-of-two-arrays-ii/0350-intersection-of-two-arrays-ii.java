class Solution {
    int[] arr1 = new int[1001];
    int[] arr2 = new int[1001];
    
    public int[] intersect(int[] nums1, int[] nums2) {
        for (int n : nums1) {
            arr1[n]++;
        }
        for (int n : nums2) {
            arr2[n]++;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            int k = Math.min(arr1[i], arr2[i]);
            for (int j = 0; j < k; j++) {
                list.add(i);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}