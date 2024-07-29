package SetExercicios;

import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjutoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemove = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemove = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemove);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjutoConvidados conjutoConvidados = new ConjutoConvidados();
        System.out.println("Existem " + conjutoConvidados.contarConvidados() + " convidado(s) dentro do set Convidados.");

        conjutoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjutoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjutoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjutoConvidados.adicionarConvidado("Convidado 4", 1236);

       conjutoConvidados.exibirConvidados();

        System.out.println("Existem " + conjutoConvidados.contarConvidados() + " convidado(s) dentro do set Convidados.");

        conjutoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjutoConvidados.contarConvidados() + " convidado(s) dentro do set Convidados.");

       conjutoConvidados.exibirConvidados();
    }
}
