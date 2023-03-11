class Musica extends Midia {
    private double duracao;
    private String artista;
    private int notas;

    public Musica(String titulo, String genero, int ano, double duracao, String artista, int notas) {
        super(titulo, genero, ano);
        this.duracao = duracao;
        this.artista = artista;
        this.notas = notas;
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