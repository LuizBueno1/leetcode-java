public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] operations = new String[]{"X--", "++X", "X++"};

        System.out.println(s.finalValueAfterOperations(operations));
    }
}
