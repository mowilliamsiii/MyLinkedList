public class MyLinkedList {
    MyNode head;

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }

    static class MyNode{
        int data;
        MyNode next;

        MyNode(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "MyNode{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public static MyLinkedList insert(MyLinkedList list, int data){

        //creating node
        MyNode node = new MyNode(data);
        //making node last in list
        node.next = null;

        if(list.head == null){
            list.head = node;
        }else{
            //traverse list until last node and insert new node as last node
            MyNode last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
        }
        return list;
    }

    public static void printMyLinkedList(MyLinkedList list){
        MyNode node = list.head;

        System.out.print("MyLinkedList: ");

        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    //Driver code
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list = insert(list, 1);
        //System.out.println(list);
        list = insert(list, 2);
        //System.out.println(list);
        list = insert(list, 3);
        //System.out.println(list);
        list = insert(list, 4);
        //System.out.println(list);
        list = insert(list, 5);
//        System.out.println(list);

        printMyLinkedList(list);
    }
}
