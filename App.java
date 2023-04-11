public class App {
    public static void main(String[] agrs) {
        Stack<String> strings = new Stack<>(2);
        try {
            strings.push("Hello");
            strings.push("World");
            System.out.println(strings.pop());
            System.out.println(strings.pop());
        } catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        }


    Queue myQueue = new Queue();
    
    myQueue.enQueue(3);
    myQueue.enQueue(2);
    myQueue.enQueue(1);

    
    myQueue.display();
    myQueue.peak();
    myQueue.deQueue();
    myQueue.display();
    

        






    }
}