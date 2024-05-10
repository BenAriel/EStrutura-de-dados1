package InterfacesAndExcecao;

public interface InterfaceList<T> {
    void addFirst(T value);
    void addLast(T value);
    boolean addAfter(T dado, T crit);
    
    T peekFirst() throws Excecao;
    T peekLast() throws Excecao;
    
    T search(T crit);
    
    T removeFirst() throws Excecao;
    T removeLast() throws Excecao;
    T remove(T crit) throws Excecao; 
    
    void show() throws Excecao;			
    void showReverse() throws Excecao;
    boolean isEmpty();
    int getSize();		
}
