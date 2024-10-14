public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> stk = new GenericStack<>(Integer.class, 5);

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(6);

        System.out.println("stack values:");
        stk.display();

        boolean found = stk.search(3);
        System.out.println("found ?: "  +found);

        try{
            System.out.println("pop edilen eleman:"+stk.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
