public class array {

    /**
     * Remove o último elemento preenchido do array.
     *
     * @param array Array de 5 posições com os valores preenchidos.
     * @return O array com o último elemento preenchido removido.
     */
    public static String[] removerUltimoElemento(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != null) {
                array[i] = null;
                return array;
            }
        }
        System.out.println("Nenhum item foi removido.");
        return array;
    }

    /**
     * Remove o primeiro elemento do array.
     *
     * @param array Array de 5 posições com os valores preenchidos.
     * @return O array com o primeiro elemento removido.
     */
    public static String[] removerPrimeiroElemento(String[] array) {
        if (array[0] == null) {
            System.out.println("Nenhum item foi removido.");
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
        return array;
    }

    /**
     * Remove o elemento do array na posição especificada.
     *
     * @param array Array de 5 posições com os valores preenchidos.
     * @param pos   Posição do elemento a ser removido.
     * @return O array com o elemento removido.
     */
    public static String[] removerElementoNaPosicao(String[] array, int pos) {
        if (pos < 0) {
            System.out.println("Índice é menor que 0.");
            return array;
        }
        if (pos >= array.length) {
            System.out.println("Índice é maior que o tamanho do array.");
            return array;
        }
        if (array[pos] == null) {
            System.out.println("Nenhum valor foi removido pois o local já está vazio.");
            return array;
        }
        for (int i = pos; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
        return array;
    }

    /**
     * Remove os espaços vazios entre os valores do array.
     *
     * @param array Array de 5 posições com os valores preenchidos.
     * @return O array com os espaços vazios removidos.
     */
    public static String[] removerEspacosVazios(String[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[j] = array[i];
                j++;
            }
        }
        for (; j < array.length; j++) {
            array[j] = null;
        }
        return array;
    }

    public static void main(String[] args) {
        // Testes
        String[] array1 = { "1", "2", "3", "4", "5" };
        String[] array2 = { "1", null, "3", "4", "5" };
        String[] array3 = { null, null, null, null, null };
        String[] array4 = { "1", null, null, null, "2" };

        System.out.println("Remover último elemento:");
        imprimirArray(removerUltimoElemento(array1.clone()));
        imprimirArray(removerUltimoElemento(array2.clone()));
        imprimirArray(removerUltimoElemento(array3.clone()));
        imprimirArray(removerUltimoElemento(array4.clone()));

        System.out.println("Remover primeiro elemento:");
        imprimirArray(removerPrimeiroElemento(array1.clone()));
        imprimirArray(removerPrimeiroElemento(array2.clone()));
        imprimirArray(removerPrimeiroElemento(array3.clone()));
        imprimirArray(removerPrimeiroElemento(array4.clone()));

        System.out.println("Remover elemento na posição:");
        imprimirArray(removerElementoNaPosicao(array1.clone(), 3));
        imprimirArray(removerElementoNaPosicao(array2.clone(), 4));
        imprimirArray(removerElementoNaPosicao(array3.clone(), 0));
        imprimirArray(removerElementoNaPosicao(array4.clone(), 1));

        System.out.println("Remover espaços vazios:");
        imprimirArray(removerEspacosVazios(array1.clone()));
        imprimirArray(removerEspacosVazios(array2.clone()));
        imprimirArray(removerEspacosVazios(array3.clone()));
        imprimirArray(removerEspacosVazios(array4.clone()));
    }

    private static void imprimirArray(String[] array) {
        for (String elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}