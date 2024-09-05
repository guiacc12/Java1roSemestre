public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        int valor = 0;
        executarExemploWhile(valor);
        executarExemploDoWhile(valor);
        executarExemploFor();

    }

    //pre determinado
    private static void executarExemploFor() {
        for (int condicao = 0; condicao < 5; condicao++) {
            System.out.println("Exemplo for " + condicao);

        }
    }

    //exemplo pos testado
    private static void executarExemploDoWhile(int condicao) {
        do {
            condicao++;
            System.out.println("Exemplo do while " + condicao);
        } while (condicao < 5);
    }

    //exemplo pre testado
    private static void executarExemploWhile(int condicao) {
        while (condicao < 5) {
            System.out.println("Exemplo while");
            condicao++;
        }
    }
}
