public class BinOps {
    private String a;
    private String b;

    public BinOps(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String sum(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) +
                Integer.parseInt(b, 2));
    }

    public String mult(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) *
                Integer.parseInt(b, 2));
    }

    public void active() {
        System.out.println(mult(a, b));
        System.out.println(sum(a, b));
    }
}