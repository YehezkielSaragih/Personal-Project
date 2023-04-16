import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class BlackJack {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("       BlackJack       ");
        System.out.println("=======================");

        System.out.print("Banyak pemain     : ");
        int totalPemain = in.nextInt();
        in.nextLine();
        QueueArray queue = new QueueArray(totalPemain);

        for(int i = 0; i < totalPemain; i++){
            
            System.out.println("=======================");
            System.out.print("Nama Pemain " + (i + 1) + "     : ");
            Pemain pemain = new Pemain();
            pemain.setNama(in.nextLine());

            System.out.println("=======================");
            System.out.println("      Stack Kartu      ");
            System.out.println("=======================");

            System.out.print("Banyak kartu      : ");
            int totalKartu = in.nextInt();
            pemain.setMaxKartu(totalKartu);
            StackArray stack = new StackArray(totalKartu);
            // Random kartu yg dpt diambil
            Random rand = new Random();
            for(int j = 0; j < totalKartu; j++){

                int kartuIndex = rand.nextInt(12);

                Kartu kartu = new Kartu(kartuIndex);
                
                pemain.setKartu(j, kartu);
            } 
            // Print kartu yg dpt diambil
            System.out.print("Kartu yg didpt    : ");
            for(int j = 0; j < totalKartu; j++){

                System.out.print(pemain.getKartu(j).getKartuNama() + " ");
            }
            System.out.println("");
            
            System.out.print("Banyak perintah   : ");
            int totalperintah = in.nextInt();
            in.nextLine();

            System.out.println("=======================");
            System.out.println("Push Kartu / Peek / Pop");

            for (int j = 0; j < totalperintah; j++) {
                
                String perintah = in.nextLine();
                String[] perintahSplit = perintah.split(" ");

                if(perintahSplit[0].equalsIgnoreCase("Push")){
                    
                    Kartu kartuFinal = new Kartu(perintahSplit[1]);
                    stack.push(kartuFinal);
                }
                else if(perintahSplit[0].equalsIgnoreCase("Peek")){
                    
                    System.out.println(stack.peek());
                }
                else if(perintahSplit[0].equalsIgnoreCase("Pop")){
                    
                    System.out.println(stack.pop());
                }
                else{
                    
                    System.err.println("Perintah tidak tersedia");
                    break;
                }
            }
            System.out.println("=======================");
            stack.print();

            pemain.setNilai(stack.nilai());
            pemain.setKartuFinal(stack);
            queue.enqueue(pemain);
            System.out.println("");
        }
        in.close();

        queue.bubbleSort();
        queue.blackjackRules();

        System.out.println("=======================");
        queue.displayQueue();
        System.out.println("=======================");
    }
}

class Kartu{

    int kartuIndex;
    String kartuNama;
    int kartuNilai;

    public int getKartuIndex() {
        
        return kartuIndex;
    }
    public String getKartuNama() {
        
        return kartuNama;
    }
    public int getKartuNilai() {
        
        return kartuNilai;
    }

    public void setKartuIndex(int kartuIndex) {
       
        this.kartuIndex = kartuIndex;
    }
    public void setKartuNama(String kartuNama) {
        
        this.kartuNama = kartuNama;
    }
    public void setKartuNilai(int kartuNilai) {
       
        this.kartuNilai = kartuNilai;
    }
    
    public Kartu(int kartuIndex){

        this.kartuIndex = kartuIndex;

        if(kartuIndex == 0){

            this.kartuNama = "2";
            this.kartuNilai = 2;
        }
        else if(kartuIndex == 1){

            this.kartuNama = "3";
            this.kartuNilai = 3;
        }
        else if(kartuIndex == 2){

            this.kartuNama = "4";
            this.kartuNilai = 4;
        }
        else if(kartuIndex == 3){

            this.kartuNama = "5";
            this.kartuNilai = 5;
        }
        else if(kartuIndex == 4){

            this.kartuNama = "6";
            this.kartuNilai = 6;
        }
        else if(kartuIndex == 5){

            this.kartuNama = "7";
            this.kartuNilai = 7;
        }
        else if(kartuIndex == 6){

            this.kartuNama = "8";
            this.kartuNilai = 8;
        }
        else if(kartuIndex == 7){

            this.kartuNama = "9";
            this.kartuNilai = 9;
        }
        else if(kartuIndex == 8){

            this.kartuNama = "10";
            this.kartuNilai = 10;
        }
        else if(kartuIndex == 9){

            this.kartuNama = "Jack";
            this.kartuNilai = 11;
        }
        else if(kartuIndex == 10){

            this.kartuNama = "Queen";
            this.kartuNilai = 12;
        }
        else if(kartuIndex == 11){

            this.kartuNama = "King";
            this.kartuNilai = 13;
        }
        else{

            this.kartuNama = "As";
            this.kartuNilai = 14;
        }
    }
    public Kartu(String kartuNama){

        this.kartuNama = kartuNama;

        if(kartuNama.equalsIgnoreCase("2")){

            this.kartuIndex= 0;
            this.kartuNilai = 2;
        }
        else if(kartuNama.equalsIgnoreCase("3")){

            this.kartuIndex = 1;
            this.kartuNilai = 3;
        }
        else if(kartuNama.equalsIgnoreCase("4")){

            this.kartuIndex = 2;
            this.kartuNilai = 4;
        }
        else if(kartuNama.equalsIgnoreCase("5")){

            this.kartuIndex = 3;
            this.kartuNilai = 5;
        }
        else if(kartuNama.equalsIgnoreCase("6")){

            this.kartuIndex = 4;
            this.kartuNilai = 6;
        }
        else if(kartuNama.equalsIgnoreCase("7")){

            this.kartuIndex = 5;
            this.kartuNilai = 7;
        }
        else if(kartuNama.equalsIgnoreCase("8")){

            this.kartuIndex = 6;
            this.kartuNilai = 8;
        }
        else if(kartuNama.equalsIgnoreCase("9")){

            this.kartuIndex = 4;
            this.kartuNilai = 9;
        }
        else if(kartuNama.equalsIgnoreCase("10")){

            this.kartuIndex = 7;
            this.kartuNilai = 10;
        }
        else if(kartuNama.equalsIgnoreCase("Jack")){

            this.kartuIndex = 8;
            this.kartuNilai = 11;
        }
        else if(kartuNama.equalsIgnoreCase("Queen")){

            this.kartuIndex = 9;
            this.kartuNilai = 12;
        }
        else if(kartuNama.equalsIgnoreCase("King")){

            this.kartuIndex = 10;
            this.kartuNilai = 13;
        }
        else if(kartuNama.equalsIgnoreCase("As")){

            this.kartuIndex = 11;
            this.kartuNilai = 14;
        }

    }
}

class Pemain{

    String nama;
    int nilai;
    int size;

    Kartu[] kartu;
    StackArray kartuFinal;

    public void setNama(String nama){

        this.nama = nama;
    }
    public void setNilai(int nilai){

        this.nilai = nilai;
    }
    public void setMaxKartu(int size){

        this.kartu = new Kartu[size];
    }
    public void setKartu(int queue,Kartu kartu){

        this.kartu[queue] = kartu;
    }
    public void setKartuFinal(StackArray kartuFinal){

        this.kartuFinal = kartuFinal;
    }
    
    public String getNama(){

        return nama;
    }
    public int getNilai(){

        return nilai;
    }
    public Kartu getKartu(int i){

        return kartu[i];
    }
    public StackArray getKartuFinal(){

        return kartuFinal;
    }

}

class StackArray {
    
    Kartu[] arr;
    int top;
    int size;
    
    public StackArray(int size) {
        
        this.size = size;
        arr = new Kartu[size];
        top = 0;
    }
    
    public void push(Kartu o) {
        
        arr[top] = o;
        
        if (top == arr.length - 1) {
            
            Kartu[] newArr = new Kartu[arr.length*2];
            
            for (int i = 0; i < arr.length; i++) {
                
                newArr[i] = arr[i];
            }
            this.arr = newArr;
        }
        top++;
    }
    
    public Kartu pop() {
        
        Kartu o = arr[top];
        top--;
        
        return o;
    }
    
    public Kartu peek() {
        
        return arr[top];
    }
    
    public void print() {
        
        System.out.print("Tumpukan Kartu = ");

        for (int i = top; i == 0; i--) {
            
            if(arr[i] != null){             
                
                System.out.print(arr[i].getKartuNama() + " ");
            }
            else{
                
                break;
            }
        }
    }

    public int nilai(){

        int nilai = 0;

        for (int i = 0; i <= top; i++) {
            
            if(arr[i] != null){             
                
                nilai = nilai + arr[i].getKartuNilai();
            }
            else{
                
                break;
            }
        }

        return nilai;
    }
}

class QueueArray {
    
    Pemain[] arr;
    int size;
    int front, rear;
    
    public QueueArray(int limit){

        this.front = this.rear = 1;
        this.arr = new Pemain[limit];
    }

    public void resize(){
        
        arr = Arrays.copyOf(arr, arr.length + 1);
    }

    public void enqueue(Pemain data){

        // If queue is still empty
        if(size == 0){

            front = rear = 0;
            arr[0] = data;
        }
        // If queue size is overlimit
        else if(size == arr.length){

            resize();
            rear = rear + 1;
            arr[rear] = data;
        }
        // If queue already have data
        else{

            rear = rear + 1;
            arr[rear] = data;
        }

        size++;
    }

    public Pemain dequeue(){

        Pemain temp = arr[front];

        // If queue is empty
        if(size == 0){

            // Exception
            System.out.println("Queue is empty !");
        }
        // If queue only have 1 element
        else if(size == 1){

            front = rear = -1;
            resize();
            size--;
        }
        // If queue already have data
        else{

            front++;
            resize();
            size--;
        }

        return temp;
    }
    
    public Pemain peek() {
        
        return arr[front];
    }

    public void displayQueue(){

        if(size == 0){
            
            System.out.println("Queue is empty");
        }
        else {
            
            System.out.println("Winner");

            // Print from front to rear
            for(int i = front; i <= rear; i++){

                System.out.println(arr[i].getNama() + " = " + arr[i].getNilai());
            }
        }
    }
    
    public void bubbleSort(){

        boolean validate = false;
        
        // Normal Sort
        while(validate == false){

            validate = true;

            for(int i = 0; i < (arr.length - 1); i++){

                if(arr[i].getNilai() < arr[i + 1].getNilai()){

                    validate = false;
                    // Temporary var to save higher int
                    Pemain temp = arr[i];
                    // Swap method
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public void blackjackRules(){

        // Blackjack Rules
        for(int i = 0; i < (arr.length - 1); i++){

            if(arr[i].getNilai() > 21){

                // Temporary var to save higher int
                Pemain temp = arr[i];
                // Swap method
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}
