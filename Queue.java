package StackImp;

public class Queue {
	int front,rear,size;
	int capacity;
	int arr[];
	public Queue(int capacity)
	{
		this.capacity=capacity;
		front=this.size;
		rear=capacity-1;
		arr=new int[this.capacity];
	}
	boolean isFull(Queue queue)
	{
		return (queue.size==queue.size);
	}
	boolean isEmpty(Queue queue)
	{
		return (queue.size==0);
	}
	void enqueue(int item)
	{
		if(isFull(this))return;
		this.rear=(this.rear+1)%this.capacity;
		this.arr[this.rear]=item;
		this.size=this.size+1;
		System.out.println(item+"Enqueued to queue");
	}
	int dequeue()
	{
		if(isEmpty(this))return Integer.MIN_VALUE;
		int item=this.arr[this.front];
		this.front=(this.front+1)%this.capacity;
		this.size=this.size-1;
		return item;
	}
	int front()
	{
		if(isEmpty(this))return Integer.MIN_VALUE;
		return this.arr[this.front];
	}
	int rear()
	{
		if(isEmpty(this))return Integer.MIN_VALUE;
		return this.arr[this.rear];
	}

	public static void main(String[] args) {
		Queue q=new Queue(10);
		q.enqueue(15);
		q.enqueue(25);
		q.enqueue(45);
		q.enqueue(86);
		q.enqueue(74);
		
		
		

	}

}
