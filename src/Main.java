public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> stk = new GenericStack<>(Integer.class, 5);
        CircularQueue<Integer> queue = new CircularQueue<>(Integer.class, 5);

//        stk.push(1);
//        stk.push(2);
//        stk.push(3);
//        stk.push(4);
//        stk.push(5);
//        stk.push(6);

//        System.out.println("stack values:");
//        stk.display();
//
//        boolean found = stk.search(3);
//        System.out.println("found ?: "  +found);
//
//        try{
//            System.out.println("pop edilen eleman:"+stk.pop());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);

        queue.enQueue(5);

        boolean found = queue.search(3);
        System.out.println("3 queue içinde var mı ? : " + found);

        try{
            System.out.println("dequeue edilen eleman:" + queue.deQueue() );
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("dequeue işleminden sonra queue");
        queue.display();

        queue.clear();
        System.out.println("Queue temizlendi");

        System.out.println("queue boş mu ? : "+ queue.isEmpty());
    }
}
