/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueMessage;
/**
 *
 * @author hp
 */
public class Queue {
    int first, last, size;
    int capacity;
    Message messages[];
    public Queue(int capacity) {
        this.capacity = capacity;
        first = this.size = 0;
        last = capacity - 1;
        messages = new Message[this.capacity];
    }
    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }
    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }
    public void enqueue(Message item) {
        if (isFull(this)) {
            System.out.println("The Queue is full!");
            return;
        }
        this.last = (this.last + 1) % this.capacity;
        this.messages[this.last] = item;
        this.size = this.size + 1;
        System.out.println("Enqueue Successfully!");
    }
    Message Delete() {
        if (isEmpty(this)) {
            System.out.println("The Queue is empty!");
            return null;
        }
        Message item = this.messages[this.first];
        this.first = (this.first + 1) % this.capacity;
        this.size = this.size - 1;
        System.out.println("Delete Successfully!");
        return item;
    }
    void Showmessage() {
        int i;
        if (isEmpty(this)) {
            System.out.println("No Message!");
            return;
        }
        System.out.println("All the message you just input:");
        System.out.println("-----------------------------------------------");
        for (i = first; i <= last; i++) {
            System.out.println(
                    "The message from: " + messages[i].getPerson() + 
                    "\nThe message is: " + messages[i].getData());
        }
        System.out.println("");
        return;
    }
}
