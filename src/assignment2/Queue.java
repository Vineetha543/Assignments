package assignment2;

public class Queue
{
   private int maxSize;
   private long[] queArray;
   private int front;
   private int rear;
   private int nItems;
   
   public Queue(int size)
   {
	   this.maxSize = size;
	   this.queArray = new long[maxSize];
	   this.front = 0;
	   this.rear = -1;
	   this.nItems= 0;
   }
   
   public void insert(long j)
   {
	   rear++;
	   queArray[rear]=j;
	   nItems++;
   }
   
   public long remove()
   {
	   long temp = queArray[front];
	   front++;
	   if(front == maxSize)
	   {
		   nItems--;
	   }
	   return temp;
   }
   
   public long peakFront()
   {
	   return queArray[front];
   }
   
   public boolean isEmpty()
   {
	   return (nItems == 0);
   }
   
   public boolean isFull()
   {
	   return (nItems==maxSize); 
   }
   public void view()
   {
	   for(int i=0;i<queArray.length;i++)
	   {
		   System.out.print(queArray[i]+ " ");
	   }
   }
    	
}
