// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }


    public static int[][] movimientoCaballo(int fila, int columna) {
        int[][] tablero = new int[8][8];

        int[][] movimientos = {
                {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
        };

        for (int[] movimiento : movimientos) {
            int nuevaFila = fila + movimiento[0];
            int nuevaColumna = columna + movimiento[1];

            if (nuevaFila >= 0 && nuevaFila < 8 && nuevaColumna >= 0 && nuevaColumna < 8) {
                tablero[nuevaFila][nuevaColumna] = 1;
            }
        }

        return tablero;


    }

    public static int[][] movimientoAlfil(int fila, int columna) {
        int[][] tablero = new int[8][8];

        for (int i = fila - 1, j = columna - 1; i >= 0 && j >= 0; i--, j--) {
            tablero[i][j] = 1;
        }

        for (int i = fila - 1, j = columna + 1; i >= 0 && j < 8; i--, j++) {
            tablero[i][j] = 1;
        }

        for (int i = fila + 1, j = columna - 1; i < 8 && j >= 0; i++, j--) {
            tablero[i][j] = 1;
        }

        for (int i = fila + 1, j = columna + 1; i < 8 && j < 8; i++, j++) {
            tablero[i][j] = 1;
        }

        return tablero;
    }

    public static int[][] movimientoTorre(int fila, int columna) {
        int[][] tablero = new int[8][8];

        for (int i = 0; i < 8; i++) {
            tablero[fila][i] = 1;
            tablero[i][columna] = 1;
        }

        tablero[fila][columna] = 0;

        return tablero;
    }


    public static int[][] movimientoReina(int fila, int columna) {
        int[][] tablero = new int[8][8];

        for (int i = 0; i < 8; i++) {
            tablero[fila][i] = 1;
            tablero[i][columna] = 1;
        }

        for (int i = fila - 1, j = columna - 1; i >= 0 && j >= 0; i--, j--) tablero[i][j] = 1;
        for (int i = fila - 1, j = columna + 1; i >= 0 && j < 8; i--, j++) tablero[i][j] = 1;
        for (int i = fila + 1, j = columna - 1; i < 8 && j >= 0; i++, j--) tablero[i][j] = 1;
        for (int i = fila + 1, j = columna + 1; i < 8 && j < 8; i++, j++) tablero[i][j] = 1;

        tablero[fila][columna] = 0;
        return tablero;
    }

    public static int[][] movimientoRei(int i, int j) {
        int[][] tablero = new int[8][8];

        for (int fila = i - 1; fila <= i + 1; fila++) {
            for (int columna = j - 1; columna <= j + 1; columna++) {
                if (fila >= 0 && fila < 8 && columna >= 0 && columna < 8 && !(fila == i && columna == j)) {
                    tablero[fila][columna] = 1;
                }
            }
        }

        return tablero;
    }






}