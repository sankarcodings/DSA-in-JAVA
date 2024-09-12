package StackDSA;

class StackArray
{
    int[] stack = new int[20];
    int size = 0;
    public void push(int data)
    {
        if(size==stack.length) {
            System.out.println("Stack Overflow --");
            return;
        }
        stack[size++] = data;
    }
    public void pop()
    {
        if(size==0)
        {
            System.out.println("Stack is Empty --");
            return;
        }
        stack[size--] = 0;
        System.out.println("Element Poped --");
    }
    public void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public void peek()
    {
        if(size==0)
        {
            System.out.println("Stack is Empty --");
            return;
        }
        System.out.println("Peek elememt of Stack -> "+stack[size-1]);
    }
    public void sizeofStack()
    {
        System.out.println("Size of The Stack -> "+size);
    }
    public void containsElement(int data)
    {
        int p=0;
        for(int i=0;i<size;i++)
        {
            if(stack[i]==data)
            {
                p=1;
                System.out.println(stack[i]+" present in the Stack --");
                return;
            }
        }
        if(p==0)
            System.out.println(data+" not present in the Stack --");
    }
    public void elementIndex(int data)
    {
        int p=0;
        for(int i=0;i<size;i++)
        {
            if(stack[i]==data)
            {
                p=1;
                System.out.println(stack[i]+" present in "+i+" index --");
                return;
            }
        }
        if(p==0)
            System.out.println(data+" not present in the Stack --");
    }
    public void updateData(int present,int change)
    {
        int p=0;
        for(int i=0;i<size;i++)
        {
            if(stack[i]==present)
            {
                stack[i] = change;
                p=1;
                System.out.println(present+" Updated to "+change);
                return;
            }
        }
        if(p==0)
            System.out.println(present+" not present in the Stack --");
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        StackArray stack = new StackArray();
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.display();
        stack.pop();
        stack.display();
        stack.peek();
        stack.sizeofStack();
        stack.containsElement(13);
        stack.elementIndex(13);
        stack.updateData(14,55);

    }
}
