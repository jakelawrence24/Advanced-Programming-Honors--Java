public class dTB{
    public static void main(String[] args) throws Exception {
        System.out.println(decToBin(0));
        System.out.println(decToBin(1));
        System.out.println(decToBin(2));
        System.out.println(decToBin(127));
    }

    public static String decToBin(int dec) {
        if (dec == 0) {
            return "0"; // special case
        }

        final StringBuilder result = new StringBuilder();
        int current = dec;

        while (current != 0) {
            result.append(current & 0x1);
            current = current >> 1;
        }

        return result.reverse().toString();
    }
}