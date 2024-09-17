package interfaces;

public interface Fila <E>{
    void add(E elemento);
    E pool();
    E peek() throws Exception;
    int size();
    boolean isEmpty();
}
