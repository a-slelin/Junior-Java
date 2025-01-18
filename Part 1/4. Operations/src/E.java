public class E {
    public static void main(String[] args) {
        String[] binary = {
          "0000",
          "0001",
          "0010",
          "0011",
          "0100",
          "0101",
          "0110",
          "0111",
          "1000",
          "1001",
          "1010",
          "1011",
          "1100",
          "1101",
          "1110",
          "1111"
        };

        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println("\ta = " + binary[a]);
        System.out.println("\tb = " + binary[b]);
        System.out.println("\ta | b = " + binary[c]);
        System.out.println("\ta & b = " + binary[d]);
        System.out.println("\ta ^ b = " + binary[e]);
        System.out.println("\t(~a & b) | (a & ~b) = " + binary[f]);
        System.out.println("\t~a & 0x0f = " + binary[g]);
    }
}
