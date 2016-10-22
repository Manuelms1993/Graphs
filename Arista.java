package Practica2;

import java.util.Objects;

public class Arista {
    
    private Nodo a;
    private Nodo b;

    public Arista(Nodo a, Nodo b) {
        this.a = a;
        this.b = b;
    }

    public Nodo getA() {
        return a;
    }

    public Nodo getB() {
        return b;
    }

    @Override
    public String toString() {
        return "El nodo "+(a.getId()+1)+" y el nodo "+(b.getId()+1)+" estan unidos por una arista.\n";
    }

    @Override
    public boolean equals(Object obj) {
        Arista arista = (Arista) obj;
        return this.a.getId()==arista.a.getId() && this.b.getId()==arista.b.getId();
    }
}
