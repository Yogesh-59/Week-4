package QueueInterface.CircularBufferSimulation;

public class CircularBuffer {
    private int[] buffer;
    private int size;
    private int head;
    private int tail;
    private int count;

      CircularBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    // Method to Insert an element into the buffer
    public void insert(int value) {
        if (isFull()) {
            head = (head + 1) % size;
            count--;
        }
        buffer[tail] = value;
        tail = (tail + 1) % size;
        count++;
    }

    // Method to Remove and return the oldest element from the buffer
    public int remove() {
        if (isEmpty()) {
            return 0;
        }
        int value = buffer[head];
        head = (head + 1) % size;
        count--;
        return value;
    }

    //Method to Check if the buffer is empty
    public boolean isEmpty() {
        return count == 0;
    }

    //Method to Check if the buffer is full
    public boolean isFull() {
        return count == size;
    }

    // Method to Print the buffer contents
    public void printBuffer() {
        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++) {
            int index = (head + i) % size;
            System.out.print(buffer[index]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
