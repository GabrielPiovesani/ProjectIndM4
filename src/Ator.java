import java.time.LocalDate;
import java.util.Date;

class Ator extends Artista{
//formacao teatro, cinema, outros..

    // ==========================ATRIBUTOS DE ATOR================================== //
   private String formacao;

    public Ator(String nomeDoArtista, LocalDate dataDeNascimento, String premiacoes, String genero, String formacao) {
        super(nomeDoArtista, dataDeNascimento, premiacoes, genero);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }


}