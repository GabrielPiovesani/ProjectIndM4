import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        // criaçao de dados mocados para utilizar os metodos ..

        var atoresMockados = new ArrayList<Ator>(Arrays.asList(
                new Ator("Daniel Radcliffe", LocalDate.parse("1996-04-04"), "Oscar 2016", "Masculino", "Cinema"),
                new Ator("Rupert Grint", LocalDate.parse("2000-12-21"), "Oscar 2022", "masculino", "Teatro"),
                new Ator("Emma Watson", LocalDate.parse("1996-04-21"), "Oscar 2016", "Feminino", "Cinema")

        ));
        var filmeMockado = new Filme
                ("Harry Potter 2",
                        "Fantasia",
                        2001, 96,
                        TipoEnum.Longa, atoresMockados,
                        "Chris Columbus",
                        "David Heyman");


//        System.out.println(filmeMockado.print_filme());


        var midiasMockadas = new ArrayList<Midia>(
                Arrays.asList(
                        new Musica("1: A Lenda", "Romance", 1998, 3.07, "Sandy & Junior", 5),
                        new Musica("2: Vamo Pular", "Animadas 2002", 2002, 3.07, "Sandy & Junior", 5),
                        new Musica("3: Grandes Coisas", "Gospel", 1998, 3.29, "Fernandinho", 5),
                        new Musica("4: Ate Amanha","rock",2022,4.22,"Rei Careca",2)
                )
        );

        var playlistMockada = new Playlist(midiasMockadas, "1", midiasMockadas.get(0), 0);

        var novaMidia = new BibliotecaDeMidias(midiasMockadas.get(0), playlistMockada, "gabriel");


        System.out.println(novaMidia.tocar_playlist());

    }


}
