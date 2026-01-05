import java.util.*;
class Node{
  int data;
  Node next;
Node(int data){
  this.data=data;
  this.next=null;
}
}
 class SinglyLinkedList{
Node head;

public void insertAtBegining(int data){
  Node newNode=new Node(data);
  newNode.next=head;
  head=newNode;
}


public void insertAtEnd(int data){

    Node newNode=new Node(data);
    if(head==null){
      head=newNode;
      return;
    }
    Node temp =head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=newNode;
}

public void display(){
Node temp=head;
while(temp!=null){
  System.out.print(temp.data+"->");
  temp=temp.next;
}
System.out.println("null");
}



public void insertAtPosition(int data, int pos){
  if(pos==1){
  Node newNode=new Node(data);
  newNode.next=head;
  head=newNode;
  }
Node newNode=new Node(data);
Node temp=head;
for(int i=1;i<pos-1&& temp!=null;i++){
  temp=temp.next;
}
  if(temp==null){
  System.out.println("pos out of range");
  return;
  }
newNode.next=temp.next;
temp.next=newNode;

}
}



public class Main{

  public static void main(String[] args){
  SinglyLinkedList list= new SinglyLinkedList();

  
  Scanner sc=new Scanner(System.in);
  System.out.println("ENter element to insert at begning");
  int a=sc.nextInt();
  list.insertAtBegining(a);
list.insertAtBegining(a);
list.insertAtBegining(a);
list.insertAtBegining(a);
list.display();
System.out.println("Enter an element to insert at the end of list");
  int b=sc.nextInt();
list.insertAtEnd(b);
  list.display();
System.out.println("ENter element and posution");
int c=sc.nextInt();
int d=sc.nextInt();
list.insertAtPosition(c,d);
 list.display();
  }
}
