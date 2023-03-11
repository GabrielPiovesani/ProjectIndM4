import java.time.LocalDate;
import java.util.Date;

public class Artista {
    //nome dtnascimento premiacoes, genero(masc, fem,ind) e seus get and set ...

    private String nomeDoArtista;
    private LocalDate dataDeNascimento;

    private String premiacoes;

    private  String genero;

    //constructor


    public Artista(String nomeDoArtista, LocalDate dataDeNascimento, String premiacoes, String genero) {
        this.nomeDoArtista = nomeDoArtista;
        this.dataDeNascimento = dataDeNascimento;
        this.premiacoes = premiacoes;
        this.genero = genero;
    }

    //get and setters
    public String getNomeDoArtista() {
        return nomeDoArtista;
    }

    public void setNomeDoArtista(String nomeDoArtista) {
        this.nomeDoArtista = nomeDoArtista;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(String premiacoes) {
        this.premiacoes = premiacoes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}




