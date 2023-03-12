import java.util.Scanner;

public class BibliotecaDeMidias {
// contendo as midias usuario e playlist e get set e o metodo tocar playlist. //
   private Midia midia;

    private Playlist playlist;

    private String usuario;


    public BibliotecaDeMidias(Midia midia, Playlist playlist, String usuario) {
        this.midia = midia;
        this.playlist = playlist;
        this.usuario = usuario;
    }

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


//    metodo tocar playlist
public String tocar_playlist(){

    Scanner insert = new Scanner(System.in);
    System.out.println("Deseja iniciar a playlist ?");
    String resposta = insert.nextLine();

    if (resposta.equalsIgnoreCase("sim")){
        System.out.println("aplicação iniciada");





    }else if(resposta.equalsIgnoreCase("nao")){
        System.out.println("ok encerrando a aplicação");
        tocar_playlist();

    }
    else{

        System.out.println("nao entendi seu comando");
        tocar_playlist();
    }


    return playlist.mostrar_midia();
}}



