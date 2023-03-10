package com.doublelinkedlist;

public class DoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	private int length;

	private class ListNode
	{
		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data)
		{
			this.data=data;
		}
	}
	public int length()
	{
		return length;
	}

	public boolean isEmpty()
	{
		return length==0;// length == null;
	}
	public void insertNewNode(int value)
	{
		ListNode newNode = new ListNode(value);
		if(isEmpty())
		{
			head=newNode;
		}
		else
		{
			tail.next=newNode;
		}
		newNode.previous=tail;
		tail=newNode;
		length++;
	}
	public ListNode  displayForward()
	{
		if(head==null)
		{
			return null;
		}

		while(head!=null)
		{
			System.out.print(head.data+" ----> ");
			head = head.next;
		}
		return head;
	}
	public ListNode displayBackward()
	{
		if(tail==null)
		{
			return null ;
		}
		while(tail!=null)
		{
			System.out.print(tail.data+" ----> ");
			tail = tail.previous;
		}
		return tail;
	}
	public void addNewNodeBegin(int value)
	{
		ListNode newNode = new ListNode(value);

		if(isEmpty())
		{
			tail = newNode;
		}
		else
		{
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
	}

	public void insertNodeLast(int value)
	{
		ListNode newNode= new ListNode(value);
		if(isEmpty())
		{
			head=newNode;
		}
		else
		{
			tail.next=newNode;
			newNode.previous=tail;
		}
		tail=newNode;
		length++;
	}
	public void deleteFirst()
	{
		if(head!=null)
		{
			ListNode temp = head;
			head=head.next;
			temp.next=null;
			
		}
		
	}
	


	public static void main(String[] args) 
	{

		DoublyLinkedList d = new DoublyLinkedList();
		//		d.insertNewNode(10);
		//		d.insertNewNode(20);
		//		d.insertNewNode(30);
		//		d.insertNewNode(40);
		//		d.insertNewNode(50);
		//		System.out.println("Add New Node Begin");
		//		d.addNewNodeBegin(5);
		//		d.addNewNodeBegin(10);
		//		System.out.println("Display the Node in Forward");
		//		System.out.println(d.displayForward());
		//		System.out.println("Display the Node in Backward");
		//		System.out.println(d.displayBackward());
		//
		//
		//		System.out.println(d.displayForward());
		d.insertNodeLast(10);
		d.insertNodeLast(20);
		d.displayForward();// not added value means increment length
		System.out.println("Remove first node ");
		d.deleteFirst();
		d.displayForward();
		



	}
}
