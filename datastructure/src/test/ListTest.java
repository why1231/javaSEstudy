package test;

import main.datasutructure.List;

public class ListTest {

    public static void main(String[] args) {
        List list = new List();
        list.add(list,new List(1));
        list.add(list,new List(2));
        list.add(list,new List(3));
        list.list(list);

       list.remove(list,1);
       list.list(list);

    }


}
