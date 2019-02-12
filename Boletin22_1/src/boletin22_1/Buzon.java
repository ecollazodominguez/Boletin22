/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22_1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ecollazodominguez
 */
public class Buzon {
    public int numeroDeCorreos(ArrayList<Correo>lista){
        Iterator it =  lista.iterator();
        int contador = 0;
        while (it.hasNext()){
            it.next();
            contador++;
            
        }
        return contador;
    }
    
    public void engade(Correo c, ArrayList<Correo>lista){
        lista.add(c);
    }
    
    public boolean porLer(ArrayList<Correo>lista){
        for (Correo correo : lista) {
            if (correo.isLeido())
                return false;                             
        }
        return true;
    }
    
    public void mostrarPorLer(ArrayList<Correo>lista){
        if (this.porLer(lista)){
            System.out.println("Non hai mensaxes por ler");
        }else{
            System.out.println("hay mensaxes por ler");
        }
    }
    
    public String amosaPrimerNoLeido(ArrayList<Correo>lista){
        Iterator it = lista.iterator();
        Correo c;
        while(it.hasNext()){
            c =(Correo)it.next();
            if (!c.isLeido())
                return c.toString();
            
        }
        return "Non hai mensaxes por ler";
    }
    
    public String amosa(int k, ArrayList<Correo>lista){
        return "Contido: "+lista.get(k).getContido();
    }
    
    public void elimina(int k, ArrayList<Correo>lista){
        lista.remove(k);
    }
    
}
