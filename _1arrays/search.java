package _1arrays;

public class search {
    public static int Linear(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                System.out.println("key found");
                return i;
            }

        }
        return -1;

    }

    public static void pairs(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + nums[i] + "," + nums[j] + ") ");
            }
            System.out.println();
        }

    }

    public static void subarray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(");
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.print(")  ");

            }
            System.out.println();
        }

    }

    public static void maxSubarray(int nums[]) {
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        int current = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                current = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (max < current) {
                    max = current;
                }
            }
        }
        System.out.println(max);

    }

    public static int Binary(int nums[], int key) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (key == nums[mid]) {
                System.out.println("key found");
                break;
            } else if (key < nums[mid]) {
                r = mid - 1;
            } else if (key > nums[mid]) {
                l = mid + 1;
            }
        }
        return -1;

    }

    public static void reverse(int nums[]) {
        int first = 0;
        int last = nums.length - 1;

        while (first < last) {
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }

    public static void kadane(int nums[]) {
        int cur = 0;
        int maa = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cur = cur + nums[i];
            if (cur >= 0) {
                if (cur > maa) {
                    maa = cur;
                }

            } else {
                cur = 0;
            }
        }
        System.out.println(maa);

    }

    public static void main(String[] args) {
        int nums[] = { -1, 2, -3, 4, 5, 6 };
        int key = 2;
        kadane(nums);
        Linear(nums, key);
        Binary(nums, key);
        maxSubarray(nums);
        reverse(nums);
        for (int x : nums) {
            System.out.println(x);
        }

    }
}