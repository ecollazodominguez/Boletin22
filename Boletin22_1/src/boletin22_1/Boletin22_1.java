/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22_1;

import Utilidades.PedirDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin22_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Correo> lista = new ArrayList<>();
        Buzon buz = new Buzon();
        int op;
        do {
            op = PedirDatos.enteiro("***Menu*** \n 1: Engadir \n 2: Cantidad correos \n 3: Correos por ler \n 4: 1º Correo \n 5: Consultar \n 6: Eliminar");
            switch (op) {
                case 1:
                    Correo a = new Correo(PedirDatos.string("contido 1º correo"), false);
                    Correo b = new Correo(PedirDatos.string("contido 2º correo"), true);
                    Correo c = new Correo(PedirDatos.string("contido 3º correo"), false);

                    buz.engade(a, lista);
                    buz.engade(b, lista);
                    buz.engade(c, lista);
                    break;
                case 2:
                    System.out.println("hay " + buz.numeroDeCorreos(lista) + " correo(s)");
                    break;
                case 3:
                    boolean si=buz.porLer(lista);
                              if(si==true){
                                  JOptionPane.showMessageDialog(null,"Tiene correos por leer");
                              }
                              else{
                                  JOptionPane.showMessageDialog(null,"No tiene correos por leer");
                              }
                              break;
                case 4:
                    System.out.println(buz.amosaPrimerNoLeido(lista));
                    break;
                case 5:
                    System.out.println(buz.amosa(PedirDatos.enteiro("nº correo")-1, lista));
                    break;
                case 6:
                    buz.elimina(PedirDatos.enteiro("nº correo")-1, lista);
                    break;
            }
        } while (op != 0);
    }

}
