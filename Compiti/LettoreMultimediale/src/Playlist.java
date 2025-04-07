import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String titolo;
    private List<Brano> brani;

    public Playlist(String titolo, ArrayList<Brano> brani) {
        this.titolo = titolo;
        this.brani = brani;
    }

    public String getTitolo() {
        return titolo;
    }

    public List<Brano> getBrani() {
        return brani;
    }


    public int getNumeroBrani() {
        return brani.size();
    }

    public Brano getBrano(int posizione) {
        if (posizione >= 0 && posizione < brani.size()) {
            return brani.get(posizione);
        }
        return null;
    }
}
