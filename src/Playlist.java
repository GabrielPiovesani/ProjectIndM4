import java.util.*;

public class Playlist {
// midias, ordem de execuçao, midia atual, get e set e o metodo proxima midia e midia anterior
    private ArrayList<Midia> midias;
    private String ordemExecucao; //ordem de execucao
    private Midia midiaAtual; // midia atual tocando
    private int numeroMidiaAtual;

    public Playlist(ArrayList<Midia> midias, String ordemExecucao, Midia midiaAtual, int numeroMidiaAtual) {
        this.midias = midias;
        this.ordemExecucao = ordemExecucao;
        this.midiaAtual = midiaAtual;
        this.numeroMidiaAtual = numeroMidiaAtual;
    }

    public ArrayList<Midia> getMidias() {
        return midias;
    }

    public void setMidias(ArrayList<Midia> midias) {
        this.midias = midias;
    }

    public String getOrdemExecucao() {
        return ordemExecucao;
    }

    public void setOrdemExecucao(String ordemExecucao) {
        this.ordemExecucao = ordemExecucao;
    }

    public Midia getMidiaAtual() {
        return midiaAtual;
    }

    public void setMidiaAtual(Midia midiaAtual) {
        this.midiaAtual = midiaAtual;
    }

    public String mostrarNomeDaMidiaAtual() {
        return midiaAtual.getTitulo();
    }

    public int getNumeroMidiaAtual() {
        return numeroMidiaAtual;
    }

    public void setNumeroMidiaAtual(int numeroMidiaAtual) {
        this.numeroMidiaAtual = numeroMidiaAtual;
    }

    public void proximaMidia() {
        if(getOrdemExecucao().equals("Alfabetica")) {
            System.out.println("reorganizando midias");
            Collections.sort(midias, new Comparator<Midia>() {
                @Override
                public int compare(Midia midia1, Midia midia2)
                {
                    return  midia1.getTitulo().compareTo(midia2.getTitulo());
                }
            });
        }

        if(numeroMidiaAtual >= (midias.size() - 1)) {
            setMidiaAtual(getMidias().get(0));
            setNumeroMidiaAtual(0);
        } else {
            setMidiaAtual(getMidias().get(numeroMidiaAtual + 1));
            setNumeroMidiaAtual(numeroMidiaAtual + 1);
        }
    }
}
