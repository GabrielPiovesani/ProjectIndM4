import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        // criaçao de dados mocados para utilizar os metodos .
        var atoresMockados = new ArrayList<Ator>(Arrays.asList(
                new Ator("Wagner Moura", LocalDate.parse("1976-06-19"), "Grande premio do cinima brasileiro", "Masculino", "Cinema"),
                new Ator("André Ramiro", LocalDate.parse("1981-01-14"), "Prêmio Guarani de Cinema", "masculino", "Teatro"),
                new Ator("Maria Ribeiro", LocalDate.parse("1975-11-09"), "Festival de Gramado. 2017", "Feminino", "Cinema")

        ));
        var atoresMockados2 = new ArrayList<Ator>(Arrays.asList(
                new Ator("Daniel Radcliffe", LocalDate.parse("1996-04-04"), "Oscar 2016", "Masculino", "Cinema"),
                new Ator("Rupert Grint", LocalDate.parse("2000-12-21"), "Oscar 2022", "masculino", "Teatro"),
                new Ator("Emma Watson", LocalDate.parse("1996-04-21"), "Oscar 2016", "Feminino", "Cinema")

        ));
        var FilmeMockado = new ArrayList<Midia>(
                Arrays.asList(
                        new Filme("Harry Potter e a Camara Secreta","Fantasia/Aventura",2002,120.07,TipoEnum.Longa,atoresMockados2,"ChrisColumbus","David heyman"),
                        new Filme("Harry Potter e o Prisioneiro de Azkaban","Fantasia",2004,120.07,TipoEnum.Longa,atoresMockados2,"ChrisColumbus","David heyman"),
                        new Filme("Tropa de Elite 1","Açao/Crime",2007,60.56,TipoEnum.Longa,atoresMockados,"José padilha","Marcos Prado"),
                        new Filme("Tropa de Elite 2","Açao/Crime",2010,100.07,TipoEnum.Longa,atoresMockados,"José padilha","Marcos Prado"))
        );
//        System.out.println(filmeMockado.print_filme());


        var midiasMockadas = new ArrayList<Midia>(
                Arrays.asList(
                        new Musica("1 A Lenda", "Romance", 1998, 3.07, "Sandy & Junior", 5),
                        new Musica("2 Vamo Pular", "Animadas 2002", 2002, 3.07, "Sandy & Junior", 5),
                        new Musica("3 Grandes Coisas", "Gospel", 1998, 3.29, "Fernandinho", 5),
                        new Musica("4 Ate Amanha","rock",2022,4.22,"Rei Careca",2),
                        new Musica("5 Festa no Ape","Pop",2000,3.22,"Latino",1),
                        new Musica("6 Chop Suey","Rock",2001,3.28,"System Of a Down",5),
                        new Musica("7 Leao","Sertanejo",2020,4.00,"Marilia Mendonça",5),
                        new Musica("8 K.O","Pop Brasil",2020,2.47,"Pablo Vittar",5),
                        new Musica("9 Numb","Rock",2003,5.00,"Linkin Park",4),
                        new Musica("10 Quem Prova Pede Mais","Sertanejo",2004,2.46,"Ana Castela",3)
                )
        );

        var playlistMockada = new Playlist(midiasMockadas, "1", midiasMockadas.get(0), 0);


        var playlistMockada2 = new Playlist(FilmeMockado,"1",FilmeMockado.get(0),0);



        var novaMidia = new BibliotecaDeMidias(midiasMockadas.get(0), playlistMockada2, "Gabriel");


        System.out.println(novaMidia.tocar_playlist());


    }



}
