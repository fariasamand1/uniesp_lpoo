public class AppSoo2 {

    public static void main(String[] args) {


        double xa = 2, xb = 3, xc = 3;
        double ya = 5, yb = 5, yc = 4;
        System.out.println("Os lados do triângulo x são: " + xa + xb + xc);

        double px = (xa + xb + xc) / 2;
        double py = (ya + yb + yc) / 2;

        System.out.println("O perímetro do triângulo x é: " + px);

        double areax = Math.sqrt(px * (px - xa) * (px - xb) * (px - xc));
        double areay = Math.sqrt(py * (py - ya) * (py - yb) * (py - yc));
        System.out.println("A área do triângulo x é" + areax);
    }
}
