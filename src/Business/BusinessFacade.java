package Business;

import Business.Model.Edicio;
import Business.Model.Prova;

public interface BusinessFacade {
    public Prova crearProva();
    public void llistarProva();
    public void eliminarProva();
    public Edicio crearEdicio();
    public void llistarEdicions();
    public void duplicarEdicio();
    public void eliminarEdicio();
    public void actualitzaPI();
    public void eliminarJugador();

}
