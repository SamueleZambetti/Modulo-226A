import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Brano brano1 = new Brano("Parlantina", "Liam");
        Brano brano2 = new Brano("La foresta dei c", "Michel");
        Brano brano3 = new Brano("Vi racconto i miei sogni", "Nicolas");
        Brano brano4 = new Brano("Dal ponte a una casa", "Gabriel");
        ArrayList<Brano> brani = new ArrayList<>();
        brani.add(brano1);
        brani.add(brano2);
        brani.add(brano3);
        brani.add(brano4);
        Playlist playlist = new Playlist("AA", brani);
        Player player = new Player("BB", "Sony", playlist);

        player.play();
        player.successivo();
        player.successivo();
        player.precedente();
    }
}
