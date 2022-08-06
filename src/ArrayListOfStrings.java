import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ArrayListOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many word?: ");
        int words = sc.nextInt();
        ArrayList<String> listString = new ArrayList<>(words);
        for (int i = 0; i < words; i++) {
            System.out.print((i + 1) + ": ");
            listString.add(sc.next());
        }
        contains3(listString);
    }
    public static boolean contains3(List<String> list) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(String str : list) {
            if(map.containsKey(str)) {
                map.put(str, map.get(str) + 1);

                if(map.get(str) == 3)
                    System.out.println(map.get(str));
                    return true;
            } else {
                map.put(str, 1);
            }
        }
// abc
        return false;
    }
//    public static void contains3(ArrayList<String> list) {
//        HashMap<String, Integer> countMap = new HashMap<>();
//
//        String[] words=new String[list.size()] ;
//        for (int i=0;i< list.size();i++){
//            words[i]=list.get(i);
//        }
//        for (int i = 0; i < words.length; i++) {
//            if (countMap.containsKey(words[i])) {
//                countMap.put(words[i], countMap.get(words[i]) + 1);
//                if (countMap.get(words[i]) >= 1) {
//                    System.out.println(countMap.get(words) + " : " + countMap.get(words[i]));
//                }
//            }
//        }
//
//    }
}


//    public static void doubleList(ArrayList<String> list){
//        for (int i=0;i<list.size();i+=2){
//            list.add(i,list.get(i));
//        }
//        for (int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }
//    }
//    public static void removeEvenLength(ArrayList<String>listString){
//        for (int i=0;i<listString.size();i++){
//            if(listString.get(i).length()%2==0){
//                listString.remove(i);
//                i--;
//            }
//        }
//        for (int i=0;i<listString.size();i++){
//            System.out.println(listString.get(i));
//        }
//    }