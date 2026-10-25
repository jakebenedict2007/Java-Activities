public class OverflowReferenceInvestigator {
    public static void main(String[] args) {
        byte b = 127;
        b++;
        System.out.println("byte after 127 + 1 = " + b);

        String a = new String("java");
        String c = new String("java");
        String d = "java";

        System.out.println("a == c " + (a == c));
        System.out.println("a == d " + (a == d));
        System.out.println("c == d " + (c == d));
        System.out.println("a.equals(c) " + a.equals(c));
        System.out.println("a.equals(d) " + a.equals(d));
        System.out.println("c.equals(d) " + c.equals(d));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 50;
        System.out.println("arr1[0] is now " + arr1[0]);
    }
}
