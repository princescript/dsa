class BreakContinue {

    public static void main(String[] args) {

        int[] nums = {10, 20, 74, 98, 52};

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 98) {
                continue;
            }
            System.out.println(nums[i]);
        }
    }
}
