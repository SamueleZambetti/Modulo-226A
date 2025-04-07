public class Player {
    private String modello;
    private String marca;
    private Playlist playlist;
    private int posizioneAttuale = 0;

    public Player(String modello, String marca, Playlist playlist) {
        this.modello = modello;
        this.marca = marca;
        this.playlist = playlist;
    }

    public void play() {
        Brano brano = playlist.getBrano(posizioneAttuale);
        if (brano != null) {
            System.out.println("Riproducendo (" + posizioneAttuale + "): " + brano);
        } else {
            System.out.println("Nessun brano da riprodurre.");
        }
    }

    public void successivo() {
        if (posizioneAttuale < playlist.getNumeroBrani() - 1) {
            posizioneAttuale++;
            play();
        } else {
            System.out.println("Sei già all'ultimo brano.");
        }
    }

    public void precedente() {
        if (posizioneAttuale > 0) {
            posizioneAttuale--;
            play();
        } else {
            System.out.println("Sei già al primo brano.");
        }
    }

    public void selezionaBrano(int n) {
        if (n >= 0 && n < playlist.getNumeroBrani()) {
            posizioneAttuale = n;
            play();
        } else {
            System.out.println("Posizione non valida.");
        }
    }
}
