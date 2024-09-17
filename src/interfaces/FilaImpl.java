package interfaces;

import java.util.ArrayList;
import java.util.List;

public class FilaImpl <E> implements Fila<E> {

    //atributo classe
    private final List<E> elementos;

    // construtor
    public FilaImpl() {

        this.elementos = new ArrayList<E>();
    }


    // metodos
    @Override
    public void add(E elemento) {
        elementos.add(elemento);
    }

    @Override
    public E pool()   {
    if (elementos.isEmpty()) {
        return null;
    }
    E elemento = elementos.getFirst();
        this.elementos.remove(0);
        return elemento;
}

    @Override
    public E peek() throws RuntimeException {
        if (this.elementos.isEmpty()){
            throw  new RuntimeException ("Fila vazia");
        }
        return this.elementos.getFirst();
    }


    @Override
    public int size() {
        return this.elementos.size();
    }

    @Override
    public boolean isEmpty() {
        return this.elementos.isEmpty();
    }

    @Override
    public String toString() {
        return "FilaImpl{" + elementos +

                '}';
    }
}
