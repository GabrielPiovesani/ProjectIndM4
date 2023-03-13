import java.time.LocalDate;
import java.util.*;
import java.util.Random;


public class Playlist {
// =================================ATRIBUTOS DE PLAYLIST======================================================== //
    private ArrayList<Midia> midias;
    private String ordemExecucao; //ordem de execucao
    private Midia midiaAtual; // midia atual tocando
    private int numeroMidiaAtual;

    public BibliotecaDeMidias aplicacao;

    public Playlist(ArrayList<Midia> midias, String ordemExecucao, Midia midiaAtual, int numeroMidiaAtual) {
        this.midias = midias;
        this.ordemExecucao = ordemExecucao;
        this.midiaAtual = midiaAtual;
        this.numeroMidiaAtual = numeroMidiaAtual;
    }


    public BibliotecaDeMidias getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(BibliotecaDeMidias aplicacao) {
        this.aplicacao = aplicacao;
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


    public String tocar_midias(){

        Scanner insert = new Scanner(System.in);
        System.out.println(
                "                                                 MIDIA TOCANDO                     "+"\n"+
                "                                                 Nome: "+midiaAtual.getTitulo()+"\n"+
                "                                                 Genero: "+midiaAtual.getGenero()+"\n"+
                "                                                 Ano de Lançamento: "+midiaAtual.getAno()+"\n"+
                "----------------------------------------------------------------------------------------------------------------------------------------------"
                +"\n"+
                "|| (NEXT) para proxima midia ||" + " (PREV) para midia anterior ||" + " (STOP) para encerrar ||" + " (PAUSE) para pausar || (RANDON) para passar aleatorio ||"+"\n"+
                "----------------------------------------------------------------------------------------------------------------------------------------------");
        String resposta = insert.nextLine();






        // metodo next ....
        if (resposta.equalsIgnoreCase("next")){


            if(numeroMidiaAtual >= (midias.size() - 1)) {
                setMidiaAtual(getMidias().get(0));
                setNumeroMidiaAtual(0);

            } else {
                setMidiaAtual(getMidias().get(numeroMidiaAtual + 1));
                setNumeroMidiaAtual(numeroMidiaAtual + 1);
            }

            tocar_midias();

            // metodo prev ....
        }else if(resposta.equalsIgnoreCase("prev")){

            if(numeroMidiaAtual == 0 ) {
                setMidiaAtual(getMidias().get(midias.size()-1));
                setNumeroMidiaAtual(getMidias().size()-1);

            } else {
                setMidiaAtual(getMidias().get(numeroMidiaAtual - 1));
                setNumeroMidiaAtual(numeroMidiaAtual - 1);
            }

            tocar_midias();


        }
        else if(resposta.equalsIgnoreCase("Pause")) {
            System.out.println("sua midia foi pausada:"+"\n"+"Nome:"+midiaAtual.getTitulo()+"\n"+
                   "reinicie o sistema" );







        }else if(resposta.equalsIgnoreCase("randon")) {

            Random random = new Random();


         if (resposta.equalsIgnoreCase("randon")){
             setMidiaAtual(getMidias().get(random.nextInt(midias.size())));
             setNumeroMidiaAtual(numeroMidiaAtual-1);


             tocar_midias();

         }

        }

        else if(resposta.equalsIgnoreCase("Stop")) {
            System.out.println("aplicação fechada muito obrigado ");

        }
        else{

            System.out.println("nao entendi seu comando");
           tocar_midias();
        }


        return "para iniciar novamente rode o codigo!";




//
    }}


