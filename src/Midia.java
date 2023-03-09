public class Midia {


   private String titulo, genero;
   public int ano;

    Midia(){}

    public Midia(String genero)
    {
        this.genero = genero;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getGenero()
    {
        return genero;
    }

    public int getAno()
    {
        return ano;
    }
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public void setAno(int ano) {

       this.ano = ano;
    }




   }


 class Musica extends Midia {

    private double duracao;
    private String artista;
    private int notas;
    public Musica() {
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }



}


 class Filme extends Midia {
    private double duracao;
    private String tipo;

    private String elenco [];//vetor de atores <<

    private  String diretor;

    private  String produtor;






}




