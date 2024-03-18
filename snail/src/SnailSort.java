public class SnailSort {
    /**
     * Este método toma una matriz 2D y devuelve una matriz 1D con los elementos dispuestos en un patrón de caracol.
     * El patrón de caracol comienza desde la esquina superior izquierda, se mueve hacia la derecha hasta el final de la fila,
     * luego hacia abajo hasta el final de la columna, luego hacia la izquierda hasta el inicio de la fila,
     * luego hacia arriba hasta la parte superior de la columna, y así sucesivamente, hasta que se han visitado todos los elementos.
     *
     * @param array La matriz 2D que se convertirá en un patrón de caracol.
     * @return Una matriz 1D con los elementos de la matriz de entrada dispuestos en un patrón de caracol.
     */
    public static int[] snail(int[][] array) {
        // Si la matriz de entrada está vacía, devuelve una matriz vacía
        if (array[0].length == 0) return new int[0];
        // La longitud de los lados de la matriz cuadrada
        int n = array.length;
        // La matriz de resultado con longitud n*n
        int[] result = new int[n*n];
        // Inicializa los índices para los límites superior, inferior, izquierdo y derecho del patrón de caracol
        int i = 0;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        // Continúa el bucle mientras haya elementos no visitados en la matriz
        while (top <= bottom && left <= right) {
            // Mueve hacia la derecha a lo largo de la fila superior
            for (int j = left; j <= right && top <= bottom; j++) result[i++] = array[top][j];
            top++;
            // Mueve hacia abajo a lo largo de la columna derecha
            for (int j = top; j <= bottom && left <= right; j++) result[i++] = array[j][right];
            right--;
            // Mueve hacia la izquierda a lo largo de la fila inferior
            for (int j = right; j >= left && top <= bottom; j--) result[i++] = array[bottom][j];
            bottom--;
            // Mueve hacia arriba a lo largo de la columna izquierda
            for (int j = bottom; j >= top && left <= right; j--) result[i++] = array[j][left];
            left++;
        }
        // Devuelve la matriz de resultado
        return result;
    }
}

