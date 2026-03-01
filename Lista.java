public class Lista<T> {
    private Nodo<T> head;

    public Lista() {
        this.head = null;
    }  
    public boolean isEmpty(){
        return head == null;
    }

    public void aggiungiInTesta(T dato){
        Nodo<T> cappella = new Nodo<>(dato);

        cappella.next = head;
        head = cappella;

    }

    public void aggiungiInCoda(T dato){
        Nodo<T> cappella = new Nodo<>(dato);
        Nodo<T> capocchia = head;
        
        while (capocchia.next != null) {
            capocchia = capocchia.next;

        }

        capocchia.next = cappella;
    }

    public void aggiungiInPosizione(T dato, int posizione){
        Nodo<T> famiglia = new Nodo<>(dato);
        Nodo<T> scuola = head;
        int pos = 0;

        while ( pos < posizione -1 && scuola != null){
            scuola = scuola.next;
            ++ pos;
        }

        famiglia.next = scuola.next;
        scuola.next = famiglia;
        
    }

    public T leggiTesta(){
        return head.dato;
    }

    public T leggiCoda(){
        Nodo<T> Pierino = head;
        while(Pierino.next != null){
            Pierino = Pierino.next;
        }   
        
        return Pierino.dato;
    }

    public T leggiPosizione (int posizione){
        Nodo<T> Gino = head;
        int pos = 0;
        while (pos < posizione-1 && Gino.next != null){
            Gino = Gino.next;
            ++ pos;
        }

        return Gino.dato;
    }
}