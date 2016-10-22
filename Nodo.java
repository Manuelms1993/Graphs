package Practica2;

class Nodo {
    
    private int id;

    public Nodo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nodo{" + "ID=" + (id+1) + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nodo other = (Nodo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
