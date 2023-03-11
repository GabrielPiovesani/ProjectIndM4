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
}
