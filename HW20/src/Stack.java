public class Stack {

    Node list;

    public void push(char a){
        list = new Node(a,list);
    }


    public char pop(){
        char a = list.getValue();
        list = list.getList();
        return a;

    }



    public boolean isEmpty(){
        return list == null;
    }



    public void printStack(){
        Node print = list;
        while(print != null){
            System.out.println(print.getValue());
            print = print.getList();

        }

    }

}