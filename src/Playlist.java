import java.time.LocalDate;
import java.util.*;

public class Playlist {
// midias, ordem de execuçao, midia atual, get e set e o metodo proxima midia e midia anterior
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


    public String mostrar_midia(){

        Scanner insert = new Scanner(System.in);
        System.out.println("esta tocando:"+ midiaAtual.getTitulo()+"\n"+
                "(NEXT) para avançar ||(PREV) para voltar ||(STOP) para encerrar || (PAUSE) para pausar ||(TROCAR) para trocar a playlist");
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

            mostrar_midia();

            // metodo prev ....
        }else if(resposta.equalsIgnoreCase("prev")){

            if(numeroMidiaAtual == 0 ) {
                setMidiaAtual(getMidias().get(midias.size()-1));
                setNumeroMidiaAtual(getMidias().size()-1);
                System.out.println(getMidias().size());
            } else {
                setMidiaAtual(getMidias().get(numeroMidiaAtual - 1));
                setNumeroMidiaAtual(numeroMidiaAtual - 1);
            }

            mostrar_midia();


        }
        else if(resposta.equalsIgnoreCase("Pause")) {
            System.out.println("sua musica foi pausada");
            reiniciar();
        }
        else if(resposta.equalsIgnoreCase("trocar")) {

            System.out.println("voce gostaria de selecionar filme ou musica?");
            if (resposta.equalsIgnoreCase("musica")){
                System.out.println("vou tocar musica");
                mostrar_midia();
            }
            else {
                System.out.println("vou tocar filme");
            }
        }
        else{

            System.out.println("nao entendi seu comando");
            mostrar_midia();
        }


        return "Obrigado";




//
    }





    private void reiniciar(){

        var atoresMockados = new ArrayList<Ator>(Arrays.asList(
                new Ator("Daniel Radcliffe", LocalDate.parse("1996-04-04"), "Oscar 2016", "Masculino", "Cinema"),
                new Ator("Rupert Grint", LocalDate.parse("2000-12-21"), "Oscar 2022", "masculino", "Teatro"),
                new Ator("Emma Watson", LocalDate.parse("1996-04-21"), "Oscar 2016", "Feminino", "Cinema")

        ));
        var filmeMockado = new Filme
                (       "Harry Potter 2",
                        "Fantasia",
                        2001, 96,
                        TipoEnum.Longa,atoresMockados,
                        "Chris Columbus",
                        "David Heyman");




//        System.out.println(filmeMockado.print_filme());


        var midiasMockadas = new ArrayList<Midia>(
                Arrays.asList(
                        new Musica("A Lenda", "Romance", 1998, 3.07, "Sandy & Junior", 5),
                        new Musica("Vamo Pular", "Animadas 2002", 2002, 3.07, "Sandy & Junior", 5),
                        new Musica("Grandes Coisas", "Gospel", 1998, 3.29, "Fernandinho", 5)
                )
        );

        var playlistMockada = new Playlist(midiasMockadas, "1", midiasMockadas.get(0), 0);


        BibliotecaDeMidias aplicacao = new BibliotecaDeMidias(midiasMockadas.get(0),playlistMockada,"gabs");

        aplicacao.tocar_playlist();

    }


//    public void proximaMidia() {
//        if(getOrdemExecucao().equals("Alfabetica")) {
//            System.out.println("reorganizando midias");
//            Collections.sort(midias, new Comparator<Midia>() {
//                @Override
//                public int compare(Midia midia1, Midia midia2)
//                {
//                    return  midia1.getTitulo().compareTo(midia2.getTitulo());
//                }
//            });
//        }
//
//        if(numeroMidiaAtual >= (midias.size() - 1)) {
//            setMidiaAtual(getMidias().get(0));
//            setNumeroMidiaAtual(0);
//
//        } else {
//            setMidiaAtual(getMidias().get(numeroMidiaAtual + 1));
//            setNumeroMidiaAtual(numeroMidiaAtual + 1);
//        }
    }


