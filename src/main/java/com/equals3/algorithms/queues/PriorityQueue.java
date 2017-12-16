package com.equals3.algorithms.queues;

public class PriorityQueue {

	private Long longArr[];
	private int maxSize;
	private int nItems;
	
	public PriorityQueue(int size) {
		this.longArr=new Long[size];
		nItems=0;
		maxSize=size;
	}
	
	public boolean isEmpty(){
		return nItems==0;
	}
	public boolean isFull(){
		return maxSize==nItems;
	}
	public long peekMin(){
		return longArr[nItems-1];
	}
	public long remove(){
		return longArr[--nItems];
	}
	public void insert(long item){
		if(nItems==0){
			// first item
			longArr[nItems++]=item;
		}
		else{
			// if items
			for(int i=nItems-1;i>=0;i--){
				if(item>longArr[i]){
					
				}
			}
		}
	}
}
