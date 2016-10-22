package Practica2;

import java.util.ArrayList;

public class Prueba {
    
    public static void test(){
        ejecutaTest(createGrafo1());
        ejecutaTest(createGrafo2());
        ejecutaTest(createGrafo3());
        ejecutaTest(createGrafo4());
        ejecutaTest(createGrafo5());
        ejecutaTest(createGrafo6());
    }

    private static boolean compruebaResultado(ArrayList<Nodo> result, Arista[] aristas) {
        for (Arista arista : aristas) {
            boolean encontrado=false;
            for (Nodo nodo : result) {
                if (arista.getA().equals(nodo) || arista.getB().equals(nodo)){
                    encontrado=true;
                    break;
                }
            }
            if (!encontrado) return false;
        }
        return true;
    }

    private static void ejecutaTest(Grafo g) {
        ArrayList<Nodo> result = Cobertura.cobertura(g);
        System.out.println("Nodos de la cobertura "+result.size()+" :");
        for (Nodo nodo : result) {
            System.out.println(nodo);
        }
        printASCII(result);
        Arista[] aristas = g.getAristas();
        System.out.println("¿Todas las aristas del grafo visitan algún nodo de la cobertura? "
                + (compruebaResultado(result,aristas)?"Si":"No") );
        System.out.println("");
    }
    
    private static void printASCII(ArrayList<Nodo> arrayList) {
        String print="";
        for (Nodo nodo : arrayList) {
            String b = "";
            String l="[ "+nodo+" ]   " + b+"   ";
            print+=l;
        }
        System.out.println(print);
    }

    private static Grafo createGrafo1() {
        Grafo g = new Grafo(6,5);
        g.setArista(1, 5);
        g.setArista(2, 5);
        g.setArista(3, 5);
        g.setArista(4, 5);
        g.setArista(2, 6);
        return g;
    }

    private static Grafo createGrafo2() {
        Grafo g = new Grafo(12,18);
        g.setArista(1, 2);
        g.setArista(2, 3);
        g.setArista(3, 4);
        g.setArista(4, 5);
        g.setArista(5, 6);
        g.setArista(6, 7);
        g.setArista(7, 1);
        g.setArista(2, 11);
        g.setArista(1, 11);
        g.setArista(3, 10);
        g.setArista(4, 9);
        g.setArista(5, 9);
        g.setArista(6, 8);
        g.setArista(7, 8);
        g.setArista(8, 12);
        g.setArista(9, 12);
        g.setArista(10, 11);
        g.setArista(10, 12);
        return g;
    }
    
    private static Grafo createGrafo3() {
        Grafo g = new Grafo(6,9);
        g.setArista(1, 4); 
        g.setArista(1, 5); 
        g.setArista(1, 6); 
        g.setArista(2, 4); 
        g.setArista(2, 5); 
        g.setArista(2, 6); 
        g.setArista(3, 4); 
        g.setArista(3, 5); 
        g.setArista(3, 6);
        return g;
    }

    private static Grafo createGrafo4() {
        Grafo g = new Grafo(6,12);
        g.setArista(1, 2); 
        g.setArista(1, 3); 
        g.setArista(2, 3); 
        g.setArista(5, 4); 
        g.setArista(5, 6); 
        g.setArista(4, 6); 
        g.setArista(1, 5); 
        g.setArista(1, 6); 
        g.setArista(2, 5);
        g.setArista(2, 4);
        g.setArista(3, 4);
        g.setArista(3, 6);
        return g;
    }

    private static Grafo createGrafo5() {
        Grafo g = new Grafo(11,100);
        g.setArista(1,2);
        g.setArista(1,4);
        g.setArista(1,5);
        g.setArista(1,7);
        g.setArista(2,1);
        g.setArista(2,3);
        g.setArista(2,8);
        g.setArista(3,2);
        g.setArista(3,4);
        g.setArista(3,9);
        g.setArista(4,1);
        g.setArista(4,3);
        g.setArista(4,10);
        g.setArista(5,1);
        g.setArista(5,6);
        g.setArista(5,10);
        g.setArista(6,5);
        g.setArista(6,7);
        g.setArista(6,11);
        g.setArista(7,1);
        g.setArista(7,6);
        g.setArista(7,8);
        g.setArista(8,2);
        g.setArista(8,7);
        g.setArista(8,9);
        g.setArista(8,11);
        g.setArista(9,3);
        g.setArista(9,8);
        g.setArista(9,10);
        g.setArista(10,4);
        g.setArista(10,5);
        g.setArista(10,9);
        g.setArista(10,11);
        g.setArista(11,6);
        g.setArista(11,8);
        g.setArista(11,10);
        return g;
    }

    private static Grafo createGrafo6() {
        Grafo g = new Grafo(12,100);
        g.setArista(1,2);
        g.setArista(1,3);
        g.setArista(1,6);
        g.setArista(1,7);
        g.setArista(1,8);
        g.setArista(2,3);
        g.setArista(2,4);
        g.setArista(2,5);
        g.setArista(2,6);
        g.setArista(3,2);
        g.setArista(3,4);
        g.setArista(3,8);
        g.setArista(3,9);
        g.setArista(4,2);
        g.setArista(4,3);
        g.setArista(4,5);
        g.setArista(4,9);
        g.setArista(4,10);
        g.setArista(5,2);
        g.setArista(5,4);
        g.setArista(5,6);
        g.setArista(5,10);
        g.setArista(5,11);
        g.setArista(6,2);
        g.setArista(6,5);
        g.setArista(6,7);
        g.setArista(6,11);
        g.setArista(7,6);
        g.setArista(7,8);
        g.setArista(7,11);
        g.setArista(7,12);
        g.setArista(8,3);
        g.setArista(8,7);
        g.setArista(8,9);
        g.setArista(8,12);
        g.setArista(9,3);
        g.setArista(9,4);
        g.setArista(9,8);
        g.setArista(9,10);
        g.setArista(9,12);
        g.setArista(10,4);
        g.setArista(10,5);
        g.setArista(10,9);
        g.setArista(10,11);
        g.setArista(10,12);
        g.setArista(11,5);
        g.setArista(11,6);
        g.setArista(11,7);
        return g;
    }
}
