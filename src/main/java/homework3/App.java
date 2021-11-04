package homework3;

import java.util.*;

public class App {
    public static void main(String[] args) {
        //Задание 1
        ArrayList<String> arrayList =
                new ArrayList<>(Arrays.asList("A","B","A","C","D","C","C","C","A","I","D","C","A","B","D","C","A","D"));
        HashSet uniqList = new HashSet(arrayList);
        System.out.println("\nДан Массив:\n"+arrayList+"\nКолличество элементов :"+arrayList.size());
        System.out.println("Уникальные элемента массива:");
        System.out.println(uniqList);
        ListIterator mainIter = arrayList.listIterator();
        Iterator abcIter = uniqList.iterator();
        int check=0;
        String str;
        while (abcIter.hasNext()){
            str = (String) abcIter.next();
            while (mainIter.hasNext()){
                if (str.equals(mainIter.next()))
                {
                    check++;
                }
            }
            mainIter = arrayList.listIterator();
            System.out.println("Слово: "+str+" встречается в массиве "+check+" раз.");
            check=0;
        }
        //Задание 2
        PhoneBook pb = new PhoneBook();
        pb.add("Иванов","+12312331");
        pb.add("Васильев", "+24345324");
        pb.get("Васильев");
        pb.add("Васильев","+6453443435");
        pb.get("Иванов");
        pb.get("Васильев");
    }
}
