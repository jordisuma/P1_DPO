package Persistence;

import Business.Model.Prova;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LlegeixFitxer {




    public ArrayList<Prova> LlegeixFitxer() throws FileNotFoundException {
        ArrayList<Prova> proves = new ArrayList<>();
        Scanner sc = new Scanner(new File(/*Path Fitxer*/""));
        sc.useDelimiter(",");
        while (sc.hasNext()){
            proves.add(infoProva(sc.next()));
        }
        return proves;
    }

    public Prova infoProva(String prova){
        String aux[] = new String[7];//Lo que te actualment
        int x = 0;
        int index = 0;

        for (int i = 0; i < prova.length() - 1; i++) {
            if (prova.charAt(i) == ','){
                aux[index] = prova.substring(x,i-1);
                x = i+1;
                index++;
            }
        }
        return new Prova(aux[0],aux[1], aux[2], Integer.parseInt(aux[3]), Integer.parseInt(aux[4]), Integer.parseInt(aux[5]), aux[6]);
    }
}
