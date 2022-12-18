import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Block {

    // stores the numbers in the block
    private Set<Integer> numbers;

    // constructs a block with the specified number of random numbers
    // between 1 and 49 (inclusive)
    public Block(int quantity) {
        this.numbers = new HashSet<>();

        // ensure that the number of numbers is between 6 and 49
        quantity = Math.max(6, quantity);
        quantity = Math.min(49, quantity);

        // generate the numbers
        Random rand = new Random();
        while (this.numbers.size() < quantity) {
            int num = rand.nextInt(49) + 1;
            this.numbers.add(num);
        }
    }

    // constructs a block with the specified numbers
    public Block(int[] nums) {
        this.numbers = new HashSet<>();
        for (int num : nums) {
            this.numbers.add(num);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int num : this.numbers) {
            sb.append(num + ",");
        }

        // remove the last comma
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
    public int[] getNumbers() {
        int[] nums = new int[this.numbers.size()];
        int i = 0;
        for (int num : this.numbers) {
            nums[i] = num;
            i++;
        }
        return nums;
    }
}
