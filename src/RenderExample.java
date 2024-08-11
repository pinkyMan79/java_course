public class RenderExample {

    static char[] alphbet = new char[]{'q', 'w', 'e', 'd', 's', 'a', 'z', 'x', 'c', 'v', 'f', 'r', 't', 'g', 'b', 'n', 'h', 'y', 'u', 'j', 'm', 'k', 'i', 'o', 'p', 'l', ',', '.', ';', '\\'};
    static char[][] matrixRender = new char[10][10];

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            char randomChar = alphbet[(int) (Math.random() * alphbet.length - 1)];
            matrixRender[(int) (Math.random() * matrixRender.length - 1)][(int) (Math.random() * matrixRender.length - 1)] = randomChar;
            render();
        }
    }

    public static void render() throws InterruptedException {
        Thread.sleep(10);
        for (int i = 0; i < matrixRender.length; i++) {
            for (int j = 0; j < matrixRender[i].length; j++) {
                if (matrixRender[i][j] == 0) {
                    System.out.println(" ");
                } else System.out.print(matrixRender[i][j] + " ");
            }
            System.out.println();
        }
    }

}
