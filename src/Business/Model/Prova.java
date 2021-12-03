package Business.Model;

public class Prova {
    private String nomProva;
    private String nomRevista;
    private String quartil;
    private int probAcceptat;
    private int probRevisio;
    private int probRebuig;
    private String tipus_prova;



    public Prova(String aux, String aux1, String aux2, int parseInt, int parseInt1, int parseInt2, String aux3) {
        //Guardar variables
    }

    public Prova() {//Es necessari?

    }


    public String getNomProva() {
        return nomProva;
    }

    public void setNomProva(String nomProva) {
        this.nomProva = nomProva;
    }

    public String getNomRevista() {
        return nomRevista;
    }

    public void setNomRevista(String nomRevista) {
        this.nomRevista = nomRevista;
    }

    public String getQuartil() {
        return quartil;
    }

    public void setQuartil(String quartil) {
        this.quartil = quartil;
    }

    public int getProbAcceptat() {
        return probAcceptat;
    }

    public void setProbAcceptat(int probAcceptat) {
        this.probAcceptat = probAcceptat;
    }

    public int getProbRevisio() {
        return probRevisio;
    }

    public void setProbRevisio(int probRevisio) {
        this.probRevisio = probRevisio;
    }

    public int getProbRebuig() {
        return probRebuig;
    }

    public void setProbRebuig(int probRebuig) {
        this.probRebuig = probRebuig;
    }

    public String getTipus_prova() {
        return tipus_prova;
    }

    public void setTipus_prova(String tipus_prova) {
        this.tipus_prova = tipus_prova;
    }
}
