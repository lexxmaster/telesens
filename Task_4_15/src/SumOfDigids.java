public class SumOfDigids {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Parameters weren't set");
            return;
        }
        String n = args[0];
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            if (!Character.isDigit(n.charAt(i))){
                System.out.println("\'" + n.charAt(i) + "\' is not a digit");
                continue;
            }
            sum += Integer.parseInt(n.charAt(i) + "");
        }
        System.out.println(sum);
    }
}
