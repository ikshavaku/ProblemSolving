import java.util.*;

class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        LinkedList<String> places = new LinkedList<String>();
        Vector<String> days = new Vector<String>();
        Stack<String> sno = new Stack<String>();

        names.add("Aditya");
        places.add("Patna");
        days.add("Sunday");
        sno.add("1");
        Iterator<String> itr1 = names.iterator();
        Iterator<String> itr2 = places.iterator();
        Iterator<String> itr3 = days.iterator();
        Iterator<String> itr4 = sno.iterator();
        while(itr1.hasNext()&&itr2.hasNext()&&itr3.hasNext()&&itr4.hasNext()){
            System.out.println(itr1.next()+itr2.next()+itr3.next()+itr4.next());
        }
    }
}