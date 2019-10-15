package org.g4g.problems.warmups.stacks;

//https://www.geeksforgeeks.org/program-to-reverse-a-linked-list-using-stack/
public class ReverseLinkedList {
    Link first =null;
    public static void main(String[] args) {
        // need stack
       // CustomStack<Link> customStack = new CustomStack<Link>(10);
       ReverseLinkedList reverseLinkedList=  new ReverseLinkedList();
       for(int i=0;i<10;i++)
       reverseLinkedList.insertFirst(i);
  //     reverseLinkedList.printList();
       reverseLinkedList.reverseList();
       System.out.println();
       reverseLinkedList.printList();

    }
    
    private Link reverseList() {
        CustomStack<Link> customStack = new CustomStack<Link>(10);
        Link first_Cloned = first;
        while(first_Cloned.next!=null){
            customStack.push(first_Cloned);
            first_Cloned=first_Cloned.next;
        }
        first=first_Cloned;
        while(!customStack.isEmpty()){
           first_Cloned.next= customStack.pop();
           first_Cloned=first_Cloned.next;
        }
        return first;
    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        newLink.next=first;
        first=newLink;
    }
    public void printList(){
        while(first!=null){
            System.out.print(first.iData+" ");
            first=first.next;
        }
    }

    class Link {
        private int iData;
        private Link next;
         Link(int Data) {
            this.iData = Data;
            this.next=null;
        }
        public void displayNext(){
            System.out.println("data ="+this.iData);
        }

    }
}