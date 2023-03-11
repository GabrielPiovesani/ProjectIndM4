import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        var atoresMockados = new ArrayList<Ator>(Arrays.asList(
                new Ator("Daniel Radcliffe", LocalDate.parse("1996-04-04"), "Oscar 2016", "Masculino", "Cinema"),
                new Ator("Rupert Grint", LocalDate.parse("2000-12-21"), "Oscar 2022", "masculino", "Teatro"),
                new Ator("Emma Watson", LocalDate.parse("1996-04-21"), "Oscar 2016", "Feminino", "Cinema")

        ));
        var filmeMockado = new Filme("Harry Potter 2", "Fantasia", 2001, 96, TipoEnum.Longa,atoresMockados, "Chris Columbus", "David Heyman");


        System.out.println(filmeMockado.print_filme());


        var midiasMockadas = new ArrayList<Midia>(
                Arrays.asList(
                        new Musica("A Lenda", "Romance", 1998, 3.07, "Sandy & Junior", 5),
                        new Musica("Vamo Pular", "Animadas 2002", 2002, 3.07, "Sandy & Junior", 5),
                        new Musica("Grandes Coisas", "Gospel", 1998, 3.29, "Fernandinho", 5)
                )
        );

        var playlistMockada = new Playlist(midiasMockadas, "Alfabetica", midiasMockadas.get(0), 0);

        System.out.println(playlistMockada.mostrarNomeDaMidiaAtual());

        playlistMockada.proximaMidia();

        System.out.println(playlistMockada.mostrarNomeDaMidiaAtual());

        playlistMockada.proximaMidia();

        System.out.println(playlistMockada.mostrarNomeDaMidiaAtual());

        playlistMockada.proximaMidia();

        System.out.println(playlistMockada.mostrarNomeDaMidiaAtual());
    }
}
