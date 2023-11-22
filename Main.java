import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        // Input userzxszxzxc
        System.out.print("Enter the number of nodes: ");
        int num = sc.nextInt();

        System.out.println("Enter the number below to be stored in the node/box: ");
        for(int i = 0; i < num; i++)
        {
            int data = sc.nextInt();
            linkedList.head = insertNode(linkedList.head, data);
        }

        // Pag remove sa duplicates
        linkedList.removeDuplicate();
        System.out.println("LinkedList after removing the duplicates:");
        linkedList.displayList();

        // Ang pagpangita ug pag display sa middle node/box
        Box middleBox = linkedList.findMiddleBox();
        if(middleBox != null)
        {
            System.out.println("Middle Node/Box: " + middleBox.data);
        } else{
            System.out.println("The list is empty and has no middle node/box :(");
        }
    }

    // Method to insert a node/box sa end sa linkedlist
    private static Box insertNode(Box head, int data)
    {
        Box box = new Box(data);

        if(head == null)
        {
            head = box;
        } else{
            Box last = head;

            while(last.next != null)
            {
                last = last.next;
            }
            last.next = box;
        }
        return head;
    }
}
