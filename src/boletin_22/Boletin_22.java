/*


2- Define a clase Buzon para xestionar unbuzon de correo  electrónicos ordenados segundo a orde de chegada.
Para representar o buzon de correo úsase un array de correos electrónicos; estes, á súa vez, son obxectos da clase
Correo e teñen como atributos un String, co contido do correo, e un indicativo para saber se foron lidos ou non.
Define a clase Correo cos métodos que creas convenientes, sabendo que a clase Buzon debe incluír os seguintes métodos públicos:
a) int numeroDeCorreos(), que calcula cantos correos hai no buzon de correo
b) void engade (Correo c), que engade c ao buzon
c) boolean porLer(), que determina se quedan correos por ler
d) String amosaPrimerNoLeido(), que amostra o primeiro correo non lido
e) String amosa(int k), que amostra o correo k-ésimo, fora lido ou non
f) void elimina(int k), que elimina o correo k-ésimo


 */
package boletin_22;

/**
 *
 * @author jalvarezotero
 */
public class Boletin_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
         Correo c1 = new Correo("Correo 1");
        Correo c2 = new Correo("Correo 2");
        Correo c3 = new Correo("Correo 3");

        Buzon buzon = new Buzon();
        buzon.agregar(c1, c2, c3);

        //Hay 3 sin leer
        System.out.println(buzon.noLeidos());

        //leemos el 1 y se marca leido
        System.out.println(buzon.muestraPrimerNoLeido());

        //leemos el 2 y se marca leido
        System.out.println(buzon.muestraPrimerNoLeido());

        //queda uno sin leer
        System.out.println(buzon.noLeidos());
        //lo eliminamos
        buzon.elimina(2);

        //no quedan correos sin leer
        System.out.println(buzon.noLeidos());

        //mostramos todos los correos
        System.out.println(buzon.muestra());

        //agregamos 3 correos mas
        Correo c4 = new Correo("Correo 4");
        Correo c5 = new Correo("Correo 5");
        Correo c6 = new Correo("Correo 6");
        buzon.agregar(c4, c5, c6);

        //mostramos todos los correos
        System.out.println(buzon.muestra());

        //eliminamos 1 correo
        buzon.elimina(2);

        //mostramos todos los correos
        System.out.println(buzon.muestra());
    }
}
