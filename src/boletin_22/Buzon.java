/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_22;

import java.util.LinkedList;

/**
 *
 * @author jalvarezotero
 */

    
    public class Buzon {
    LinkedList<Correo> cola = new LinkedList<>();


    public int numeroDeCorreos() {// que calcula cantos correos hai no buzon de correo
        return cola.size();
    }

    public void agregar(Correo correo) {// que engade c ao buzon
        cola.add(correo);
    }

    public void agregar(Correo... correos) {
        for (int i = 0; i < correos.length; i++) {
            cola.add(correos[i]);
        }
    }

    public boolean noLeidos() {// que determina se quedan correos por ler
        boolean noLeidos = false;
        for (int i = 0; i < cola.size(); i++)
            if (!cola.get(i).isLeido())
                noLeidos = true;
        return noLeidos;
    }

    public String muestraPrimerNoLeido() {// que amostra o primeiro correo non lido
        for (int i = 0; i < cola.size(); i++)
            if (!cola.get(i).isLeido())
                return cola.get(i).getContenido();
        return "No hay correos sin leer";
    }

    public String muestra(int k) {// que amostra o correo k-ésimo, fora lido ou non
        return cola.get(k).getContenido();
    }

    public String muestra() {
        String buzon = "";
        for (int i = 0; i < cola.size(); i++) {
            buzon += muestra(i) + "\n";
        }
        return buzon;
    }

    public void elimina(int k) {//, que elimina o correo k-ésimo.
        cola.remove(k);
    }
}
