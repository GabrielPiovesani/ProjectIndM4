import java.time.LocalDate;
import java.util.Date;

class Musico extends Artista{
    //musico atuaçao instrumento ou vocal
    private String atuacao;

    public Musico(String nomeDoArtista, LocalDate dataDeNascimento, String premiacoes, String genero, String atuacao) {
        super(nomeDoArtista, dataDeNascimento, premiacoes, genero);
        this.atuacao = atuacao;
    }

    public String getAtuacao() {
        return this.atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}