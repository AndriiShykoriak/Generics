import generic.HighLowElementArray;
import generic.MyList;
import generic.MyListModify;

public class Application {
    public static void main(String[] args) {

        MyList<Double> myList = new MyList<Double>();
        myList.add(5.0);
        myList.add(2.1);
        myList.add(8.5);
        System.out.println("largest  = " + myList.largest());
        System.out.println("smallest = " + myList.smallest());

        MyListModify<Integer> integerMyListModify = new MyListModify<Integer>();
        integerMyListModify.add(899);
        integerMyListModify.add(345);
        integerMyListModify.add(888);
        System.out.println("printLargest  = " + integerMyListModify.printLargest());
        System.out.println("printSmallest = " + integerMyListModify.printSmallest());

        MyListModify<String> stringMyListModify = new MyListModify<String>();
        stringMyListModify.add("Lviv");
        stringMyListModify.add("Kiev");
        stringMyListModify.add("Odesa");
        System.out.println(stringMyListModify.printLargest());
        System.out.println(stringMyListModify.printSmallest());

        Integer[] arr = {67, 45, 34, 34, 55, 44};
        HighLowElementArray<Integer> array = new HighLowElementArray<Integer>(arr);
        System.out.println("HighElementArray = " + array.getHighElementArray());
        System.out.println("LowElementArray  = " + array.getLowElementArray());
    }
}
