package cau_truc_du_lieu.arraylist;

public class MyList<E> {
    int size=0;
    static final int DEFAUlT_CAPACITY =10;
    Object element[];
    public MyList(){
        element= new Object[DEFAUlT_CAPACITY];
    }
    public MyList(int capacity){
        if (capacity<0){
            throw new IllegalArgumentException(" Initial capacity is negative");
        }
        element= new Object[capacity];
    }
    public void add(int index, E e){

        if (index> size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        if (index==size){
            ensureCapacity(size+1);
        }
        element[size++]= e;
    }
    public E reomve(int index){
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        E temp= (E) element[index];
        for (int i =index;i<size-2;i++){
            element[i]=element[i+1];
        }
        element[size-1]=null;
        size--;
        return temp;
    }
    public int size(){
        return element.length;
    }
    public E clone(){
        Object temp[]= new Object[size];
        temp =  element;
        return (E)temp;
    }
    public boolean contains(E e){
        for (Object i: element) {
            if (e==i)
                return true;
        }
        return false;
    }
    public int indexOf(E e){
        for (int i=0;i<size-1;i++){
            if (element[i]==e)
                return i;
        }
        return -1;
    }
    public boolean add(E e){
        if (contains(e))
            return false;
        else{

            ensureCapacity(size+1);
            element[size++]=e;
            return true;
        }
    }
    public void ensureCapacity(int minCapacity){
        Object temp[]= new Object[minCapacity];
        element=temp;
    }
    public E get(int i){
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }
    public void clear(){
        element=null;
        size=0;
    }
}
