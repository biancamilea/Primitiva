public class Main {
    public static void main(String[] args) {
        // create a ticket with 8 blocks
        Ticket ticket = new Ticket(8);
        System.out.println("Ticket:\n" + ticket.toString());

        // preselected numbers
        int[] nums = {5, 10, 15, 20, 25, 30, 35, 40, 45};
        Block block = new Block(nums);
        System.out.println("Block:\n" + block.toString());
    }
}