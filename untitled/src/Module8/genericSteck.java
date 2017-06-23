package Module8;

import java.util.Stack;

/**
 * Created by user on 10.10.2016.
 */
public class genericSteck<E> {

    Stack<E> stk = new Stack<E>();

    public void push (E obj){

        stk.push(obj);
    }

    public E pop(){

        E obj = stk.pop();
        return obj;
    }
}
