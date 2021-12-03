package Persistence;

import Business.Model.Edicio;

public interface EdicioDAO {
    public void guardarInfo(Edicio edicio);
    public void actualitzaInfo(Edicio edicio);
    public void eliminaInfo (Edicio edicio);
}
