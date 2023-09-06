import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackExercise {

    public static void qOne(Stack stack){
        Queue queue = new LinkedList();
        // fill up the queue from the stack
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        // print the queue
        while(!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }

    public static Stack qTwo(Stack stack, int index, int val){
        int size = stack.size();
        Stack temp = new Stack<Integer>();
        while(index != size){
            temp.add(stack.pop());
            size--;
        }
        stack.add(val);
        while(!temp.isEmpty()){
            stack.add(temp.pop());
        }
        return stack;
    }

    public static void main(String[] args){
        //create Stack using built in Java class
        Stack stackA = new Stack<Integer>();

        Stack stackB = new Stack<Integer>();

        //push elements into stack
        stackA.push(1);
        stackA.push(2);
        stackA.push(3);
        stackA.push(4);

        stackB.push(1);
        stackB.push(2);
        stackB.push(3);
        stackB.push(5);

        //call methods
        qOne(stackA);
        Stack bResult = qTwo(stackB,3,4);
        while(!bResult.isEmpty()){
            System.out.print(bResult.pop() + " ");
        }

    }


}