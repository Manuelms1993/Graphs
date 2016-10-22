
package Practica2;

import java.util.ArrayList;

public class Cobertura {
    
    public static ArrayList<Nodo> cobertura (Grafo G){
        ArrayList<Nodo> S =  new ArrayList<>();
        ArrayList<Arista> Eprima =  new ArrayList<>();
        ArrayList<Arista> E =  new ArrayList<>();
        for (Arista arista : G.getAristas())
            E.add(arista);
        while (!E.isEmpty()) {
            Arista A = eleccion(E,E.size());
            incidentes(Eprima,E,A);
            S.add(A.getA());
            S.add(A.getB());
            eliminar(Eprima,Eprima.size(),E,E.size());
        }
        return S;
    } 

    private static Arista eleccion(ArrayList<Arista> E, int n) {
        return E.get( (int)(Math.random()* n) );
    }

    private static void incidentes(ArrayList<Arista> Eprima, ArrayList<Arista> E, Arista A) {
        Eprima.clear();
        for (Arista arista : E) {
            if (arista.getA().getId()==A.getA().getId() || arista.getA().getId()==A.getB().getId())
                Eprima.add(arista);
            else if (arista.getB().getId()==A.getA().getId() || arista.getB().getId()==A.getB().getId())
                Eprima.add(arista);
        }
    }

    private static void eliminar(ArrayList<Arista> Eprima, int nPrima, ArrayList<Arista> E, int nE) {
        for (int i = nE-1 ; i >= 0; i--) 
            for (int j = 0; j < nPrima ; j++) 
                if (E.get(i).equals(Eprima.get(j))){
                    E.remove(i);
                    break;
                }
            
    }
}
