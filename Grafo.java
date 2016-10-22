package Practica2;

public class Grafo {
    
    private Arista[] aristas;
    private int nAristas;
    private Nodo[] nodos;

    public Grafo(int nNodos, int nAristas) {
        nodos= new Nodo[nNodos];
        aristas= new Arista[nAristas];
        nAristas=0;
        for (int i = 0; i < nNodos; i++)
            nodos[i]= new Nodo(i);  
    }
    
    public void setArista(int nodoA, int nodoB){
        aristas[nAristas++]= new Arista(nodos[nodoA-1], nodos[nodoB-1]);
    }

    public Arista[] getAristas() {
        int n=0;
        for (int i = 0; i < aristas.length; i++)
            if (aristas[i]!=null) n++;
        Arista[] a = new Arista[n];
        for (int i = 0; i < n; i++)
            a[i]=aristas[i];
        return a;
    }  
}