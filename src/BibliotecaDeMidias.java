import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BibliotecaDeMidias {
// ==========================ATRIBUTOS DE BIBLIOTECA DE MIDIAS=================================== //
   private Midia midia;

    private Playlist playlist;

    private String usuario;

//==========================CONSTRUCTOR==============================================================//
    public BibliotecaDeMidias(Midia midia, Playlist playlist, String usuario) {
        this.midia = midia;
        this.playlist = playlist;
        this.usuario = usuario;
    }
//===========================SET AND GET ================================================================//
    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    //  ==================METODO TOCAR_PLAYLIST======================================================///
public String tocar_playlist(){

    Scanner insert = new Scanner(System.in);
    System.out.println("Bem Vindo "+getUsuario() +"\n"+
            "Deseja iniciar a sua playlist?" );
    String resposta = insert.nextLine();

    if (resposta.equalsIgnoreCase("sim")){

        playlist.tocar_midias();

    }
     else if (resposta.equalsIgnoreCase("nao")) {
        System.out.println("ok encerrando a aplicação");


    } else{

        System.out.println("nao entendi seu comando");
        tocar_playlist();
    }


    return getUsuario();
}}



