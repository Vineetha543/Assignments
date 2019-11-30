package heap;

public class HeapExe 
{
	public static void main(String[] args) 
	{
          Heap h = new Heap(10);
          
          h.insert(10);
          h.insert(12);
          h.insert(42);
          h.insert(35);
          h.insert(16);
          h.insert(88);
          h.insert(42);
          h.insert(7);
 
         h.displayHeap(); 
          
	}
}
