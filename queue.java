
public class queue {
    int num[] ;
    int i;
    int top;
    int maxSize;
    public queue(int length)
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
    public void pop()
    {
        for(i=0;i<top;i++) {
           num[i]=num[i+1];
        }
        top--;
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
            }
        }
    }
    public static void main(String a [])
    {
        queue q=new queue(5);
        q.push(51);
        q.push(56);
        q.push(56);
        q.pop();
        q.push(566);
        q.pop();
        q.print();
    }
}
