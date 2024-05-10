package InterfacesAndExcecao;

public interface InterfaceFila <T>{
	void add(T element) throws Excecao;
	T remove() throws Excecao;
	
	T peek() throws Excecao;
	
	boolean isEmpty() throws Excecao;
    void show() throws Excecao;
	
}
