import java.util.Scanner;

public class stack {
    int num[] ;
    int i;
    int top;
    int maxSize;
    public stack(int length)
    {
       this.maxSize=length;
        top=-1;
        num=new int [maxSize];
    }
    public boolean isEmpty()
    {
        return  top==-1;
    }
    public boolean isFull()
    {
        return top==maxSize-1;
    }
    public void push(int newElm)
    {
        if(!isFull()) {
            num[++top] = newElm;
        }
        else
        {
            System.out.println("array is full");
        }
    }
    public int pop()
    {
        return num[top--];
    }
    public void peek()
    {
        if(!isEmpty())
        System.out.println("top element is "+num[top]);
        else
            System.out.println("array is Empty");
    }
    public void print() {
        if(isEmpty())
        {
            System.out.println("array is Empty");
        }
        else {
            System.out.println("numbers are:");
            for (i = 0; i <= top; i++) {
                System.out.print(num[i] + " ");
                System.out.println();
            }
        }
    }
    public static void main(String a [])
    {
        stack st=new stack(5);
        st.push(50);
        st.push(45);
        st.push(65);
        st.push(85);
        st.pop();
        st.print();
        st.peek();
    }
}
