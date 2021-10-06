public class StackGeneric<T> {
    public T[] soal;
    public int top = 0;

    public StackGeneric(int n) {
        soal =(T[]) new Object[n];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == soal.length;
    }

    public void push(T value) {
        if (!isFull()) {
            soal[top] = value;
            top = top + 1;
        } else {
            System.out.println("Stack Penuh");
        }
    }


    public T pop() {
        if (!isEmpty()) {
            top = top - 1;
            T a = soal[top];
            return a;
        } else {
            return null;
        }
    }
        public T peek () {
            if (!isEmpty()) {
                return soal[top - 1];
            } else {
                return null;
            }
    }
}

