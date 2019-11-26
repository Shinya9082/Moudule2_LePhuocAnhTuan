package cau_truc_du_lieu.arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList= new MyList<Integer>();
        myList.add(0,1);
        myList.add(0,2);
        myList.add(0,3);
        myList.add(1,5);

        myList.reomve(0);
    }
}
