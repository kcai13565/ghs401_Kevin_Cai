
public class Pythag
{
    public static void main() {
        int[] a = new int[1000];
        int[] b = new int[1000];
        int[] c = new int[1000];
        int x = 0;
        int t = 0;
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            b[i] = i + 1;
            c[i] = i + 1;
        }
        for (int z = 1; z < a.length; z++) {
            for (int n = 1; n < b.length; n++) {
                for (int m = 1; m < c.length; m++) {
                    int c_square = m * m;
                    int b_square = n * n;
                    int a_square = z * z;
                    int sum = a_square + b_square;
                    if (sum == c_square) {
                        if ((z + n + m) == 1000) {
                            System.out.println("Found it!");
                            x = z;
                            t = n;
                            y = m;
                        }
                    }
                }
            }
        }
        System.out.println(x + " " + t + " " + y);
        System.out.println(x * t * y);
    }
}
