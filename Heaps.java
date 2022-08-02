package Heap;

import java.util.ArrayList;
import java.util.Scanner;

class Element
{
	int data;
	int priority;
	public Element(int data, int priority)
	{
		this.data= data;
		this.priority=priority;
	}
}

public class Heaps {
	ArrayList<Element> heap;
	public Heaps()
	{
		heap= new ArrayList<>();
	}
	public boolean isEmpty()
	{
		return heap.size()==0;
	}
	public int size()
	{
		return heap.size();
	}
	public void insert(int data, int priority)
	{
		Element ele = new Element(data,priority);
		heap.add(ele);
		int childIndex= heap.size()-1;
		int parentIndex = (childIndex-1)/2;
	while(childIndex>0) 
	{	if(heap.get(childIndex).priority<heap.get(parentIndex).priority)
		{
			Element temp= heap.get(parentIndex);
			heap.set(parentIndex,heap.get(childIndex));
			heap.set(childIndex, temp);
			childIndex= parentIndex;
			parentIndex= (childIndex-1)/2;
		}
	else
	{
		return;
	}
	}
	}
    public int getMin() throws PriorityQueueException
    {
    	if (isEmpty())
    	{
    		throw new PriorityQueueException();
    	}
    	return heap.get(0).data;
    }
    public int removeMin() throws PriorityQueueException
    {
    	if (isEmpty())
    	{
    		throw new PriorityQueueException();
    	}
    	Element ele = heap.get(0);
    	heap.set(0, heap.get(heap.size()-1));
    	int parentIndex=0;
    	int leftChild = 2*parentIndex+1;
    	int rightChild = 2*parentIndex+2;
    	
    while(leftChild<heap.size()) 
    {	int minIndex=parentIndex;
    	if(heap.get(leftChild).priority<heap.get(minIndex).priority)
    	{
    		minIndex=leftChild;
    	}
    	if(rightChild<heap.size() && heap.get(rightChild).priority<heap.get(minIndex).priority)
    	{
    		minIndex=rightChild;
    	}
    	if(parentIndex==minIndex) break;
    	Element temp= heap.get(parentIndex);
    	heap.set(parentIndex, heap.get(minIndex));
    	heap.set(minIndex, temp);
    	parentIndex=minIndex;
    	leftChild = 2*parentIndex+1;
    	rightChild = 2*parentIndex+2;
    }
    return ele.data;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 to insert element, 2 to get size, 3 to get minimum, 4 to remove ");
	

	}

}
