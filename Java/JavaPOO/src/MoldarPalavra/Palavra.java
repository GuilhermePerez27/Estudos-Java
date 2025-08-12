package MoldarPalavra;

public class Palavra {
    public String palavra;

    //Iversor de palavras
    public String iverterPalavra() {
        String invertido = new StringBuilder(palavra).reverse().toString();
        return invertido;
    }



    //Contador de Vogais
    public int contarVogais() {
        int contador = 0;
        //Nesta estrutura de repetição ele pega letra por letra e verifica se ela é Vogal, se sim o contador aumenta em 1
        for (int i = 0; i<palavra.length(); i++) {
            char letra = Character.toLowerCase(palavra.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'O' || letra == 'I' || letra == 'U') {
                contador++;
            }
        }
        return contador;
    }



    //Contador de Consoantes
    public int contarConsoantes() {
        int contador = 0;
        //Nesta estrutura de repetição ele pega letra por letra e verifica se ela é Consoante, se sim o contador aumenta em 1
        for (int i = 0; i<palavra.length(); i++) {
            char letra = Character.toLowerCase(palavra.charAt(i));
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u' && letra != 'A' && letra != 'E' && letra != 'O' && letra != 'I' && letra != 'U') {
                contador++;
            }
        }
        return contador;
    }


    //Adição de Palavras
    public void adicionarPalavras(String palavraAAdicionar) {
        palavra = new StringBuilder(palavra).append(palavraAAdicionar).toString();
    }
}
