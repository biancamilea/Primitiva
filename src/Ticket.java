import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ticket {

    // stores the blocks on the ticket
    private List<Block> blocks;

    // constructs a ticket with the specified number of blocks,
    // each containing 6 random numbers between 1 and 49 (inclusive)
    public Ticket(int numBlocks) {
        this.blocks = new ArrayList<>();
        for (int i = 0; i < numBlocks; i++) {
            this.blocks.add(new Block(6));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Block block : this.blocks) {
            sb.append(block.toString() + "\n");
        }
        return sb.toString();
    }

    public void printUsedNumbers() {
        Set<Integer> usedNumbers = new HashSet<>();
        for (Block block : this.blocks) {
            for (int num : block.getNumbers()) {
                usedNumbers.add(num);
            }
        }

        for (int num : usedNumbers) {
            System.out.print(num + ",");
        }
        System.out.println();
    }
}
