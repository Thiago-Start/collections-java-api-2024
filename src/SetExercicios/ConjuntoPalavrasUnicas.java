package SetExercicios;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<ConjuntoPalavras> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String animais) {
        palavrasSet.add(new ConjuntoPalavras(animais));
    }

    public void removerPalavra(String animais) {
        ConjuntoPalavras palavrasParaRemover = null;
        for (ConjuntoPalavras c : palavrasSet) {
            if (c.getAnimais().equalsIgnoreCase(animais)) {
                palavrasParaRemover = c;
                break;
            }
        }
        palavrasSet.remove(palavrasParaRemover);
    }

    public void verificarPalavra(String animais) {
        ConjuntoPalavras palavraVerificada = null;
        for (ConjuntoPalavras v : palavrasSet) {
            if (v.getAnimais().equalsIgnoreCase(animais)) {
                palavraVerificada = v;
                break;
            }
        }
        System.out.println("A palavra " + palavraVerificada + " está na lista.");
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        System.out.println("Existem " + conjuntoPalavrasUnicas.palavrasSet.size() + " palavras na lista");

        conjuntoPalavrasUnicas.adicionarPalavra("Zebra");
        conjuntoPalavrasUnicas.adicionarPalavra("Zebra");
        conjuntoPalavrasUnicas.adicionarPalavra("Tatu");
        conjuntoPalavrasUnicas.adicionarPalavra("Cachorro");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("Existem " + conjuntoPalavrasUnicas.palavrasSet.size() + " palavras na lista");

        conjuntoPalavrasUnicas.removerPalavra("Zebra");
        System.out.println("Existem " + conjuntoPalavrasUnicas.palavrasSet.size() + " palvras na lista");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
