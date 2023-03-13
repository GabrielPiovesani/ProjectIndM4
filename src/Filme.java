import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

class Filme extends Midia {
    // ==========================ATRIBUTOS DE FILME=================================== //
    private double duracao;
    private TipoEnum tipo;

    private ArrayList<Ator> elenco;//vetor de atores <<

    private  String diretor;

    private  String produtor;



//constructor

    public Filme(String titulo, String genero, int ano, double duracao, TipoEnum tipo, ArrayList<Ator> elenco, String diretor, String produtor) {
        super(titulo, genero, ano);
        this.duracao = duracao;
        this.tipo = tipo;
        this.elenco = elenco;
        this.diretor = diretor;
        this.produtor = produtor;

    }

    //Get and Setters


    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Ator> getElenco() {
        return this.elenco;
    }

    public void setElenco(ArrayList<Ator> elenco) {
        this.elenco = elenco;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }



    // metodo para mostrar o filme//
    public String print_filme() {
        return "Filme:" + getTitulo() + "\n" +
                "Genero:" + getGenero()+"\n"+
                "Ano:"+ getAno()+"\n"+
                "Duração:" + getTipo()+"\n"+
                "Elenco:"+ juntando_elenco()+"\n"+
                "Diretor:"+getDiretor()+"\n"+
                "Produtor:"+getProdutor();

    }

    // metodo para juntar o elenco//
    public String juntando_elenco() {
        StringBuffer sb = new StringBuffer();
        for (Ator ator : getElenco()) {
            sb.append( "\n"+ator.getNomeDoArtista());

        }
        return sb.toString();
    }



}

