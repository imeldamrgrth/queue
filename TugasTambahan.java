import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Membuat objek antrian dengan tipe Integer
        QueueOperation queueOperation = new QueueOperation();

        int pilih;
        do {

            System.out.println("\n==== DAFTAR MENU QUEUE =====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. IsEmpty");
            System.out.println("5. Size");
            System.out.println("6. Check Data Queue");
            System.out.println("7. Exit");

            Scanner in = new Scanner(System.in);
            System.out.print("Pilih menu [1..7]: ");
            pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan element: ");
                    queueOperation.addQueue(in.nextInt());
                    break;
                case 2:
                    queueOperation.removeQueue();
                    break;
                case 3:
                    queueOperation.peekQueue();
                    break;
                case 4:
                    queueOperation.isEmptyQueue();
                    break;
                case 5:
                    queueOperation.checkSizeQueue();
                    break;
                case 6:
                    queueOperation.checkDataQueue();
                    break;
                default:
                    System.out.println("Selamat tinggal!");
            }

        } while (pilih != 7);
    }
}

class QueueOperation {
    public Queue<Integer> queue = new LinkedList<>();

    public void addQueue(Integer data) {
        queue.add(data);
    }

    public void removeQueue() {
        queue.remove();
    }

    public void peekQueue() {
        if (queue.isEmpty()) {
            System.out.println("Elemen queue kosong");
        } else {
            System.out.println("Nilai head adalah " + queue.peek());
        }
    }

    public void isEmptyQueue() {
        if (queue.isEmpty()) {
            System.out.println("Elemen queue kosong");
        } else {
            System.out.println("Elaman tidak kosong!");
        }
    }

    public void checkSizeQueue() {
        if (queue.isEmpty()) {
            System.out.println("Elemen queue kosong!");
        } else {
            System.out.println("Elemen pada queue sebanyak " + queue.size());
        }
    }

    public void checkDataQueue() {
        if (queue.isEmpty()) {
            System.out.println("Elemen queue kosong!");
        } else {
            System.out.print("Elemen pada queue: ");
            for (Integer element : queue) {
                System.out.print(element + " ");
            }
        }
    }
}
