import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Vector;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class Q41 {
    public static void main(String[] args) {
        
    //a) List:

//ArrayList: É uma classe de implementação de List baseada em array. É melhor para armazenar e acessar dados.

List<String> arrayList = new ArrayList<>();
arrayList.add("Exemplo");
arrayList.add("ArrayList");

//Vector: É semelhante ao ArrayList, mas é sincronizado. é melhor para manipulação de threads(varios acessos ao mesmo tempo).

List<String> vector = new Vector<>();
vector.add("Exemplo");
vector.add("Vector");

//LinkedList: É uma classe de implementação de List baseada em dados. É melhor para manipulação de dados

List<String> linkedList = new LinkedList<>();
linkedList.add("Exemplo");
linkedList.add("LinkedList");

//b) Set:

//HashSet: Não mantém a ordem dos elementos.

Set<String> hashSet = new HashSet<>();
hashSet.add("Exemplo");
hashSet.add("HashSet");

//LinkedHashSet: Mantém a ordem de inserção dos elementos.
Set<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("Exemplo");
linkedHashSet.add("LinkedHashSet");

//TreeSet: Armazena elementos em uma árvore Red-Black e mantém a ordem dos elementos com base em seus valores.
Set<String> treeSet = new TreeSet<>();

treeSet.add("Exemplo");
treeSet.add("TreeSet");
//c) Queue:

//PriorityQueue: Os elementos da fila são ordenados de acordo com seu valor natural ou por um Comparator fornecido no momento da construção da fila.

Queue<String> priorityQueue = new PriorityQueue<>();
priorityQueue.add("Exemplo");
priorityQueue.add("PriorityQueue");

//LinkedList: Pode ser usada como uma fila porque implementa a interface Queue.


Queue<String> linkedListQueue = new LinkedList<>();
linkedListQueue.add("Exemplo");
linkedListQueue.add("LinkedList");

//d) Deque:

//LinkedList: Também pode ser usada como uma deque porque implementa a interface Deque.


Deque<String> linkedListDeque = new LinkedList<>();
linkedListDeque.add("Exemplo");
linkedListDeque.add("LinkedList");

//e) Map:

//HashMap: Não mantém a ordem dos elementos.

Map<String, String> hashMap = new HashMap<>();
hashMap.put("chave", "HashMap");

//LinkedHashMap: Mantém a ordem de inserção dos elementos.

Map<String, String> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put("chave", "LinkedHashMap");
System.out.println(linkedHashMap);

//TreeMap: Armazena elementos em uma árvore Red-Black e mantém a ordem dos elementos com base em suas chaves.

Map<String, String> treeMap = new TreeMap<>();
treeMap.put("chave", "TreeMap");
    }
}
