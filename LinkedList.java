class LinkedList {
    Box head;

    // Method sa pagparemove sa duplicates sa linkedlist
    public void removeDuplicate()
    {
        Box current = head;

        while(current != null)
        {
            Box box = current;

            while(box.next != null)
            {
                if(box.next.data == current.data)
                {
                    box.next = box.next.next;
                } else{
                    box = box.next;
                }
            }
            current = current.next;
        }
    }

    public Box findMiddleBox()
    {
        // Checking if the linkedlist is not empty
        if(head == null)
        {
            // If linkedlist is empty, then there is no middle node/box
            return null;
        }

        // Initializes two pointers. slowPointer moves one mode at a time while fastPointer moves two nodes at a time
        Box slowPointer = head;
        Box fastPointer = head;

        while(fastPointer != null && fastPointer.next != null)
        {
            // Moving slowPointer one step
            slowPointer = slowPointer.next;

            // Moving fastPointer two steps
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    // Method sa pagdisplay sa linkedlist
    public void displayList()
    {
        Box current = head;
        
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
