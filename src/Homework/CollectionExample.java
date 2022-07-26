package Homework;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {

//        String[] strings = {"poxos", "petros"};
//        System.out.println(arrayToList(strings));
//        List<String> linkedList = new ArrayList<>();
//        linkedList.add("petros");
//        linkedList.add("aram");
//        linkedList.add("barev");
//        System.out.println(listToSet(linkedList));
//        List<Integer> integers = new ArrayList<>();
//        integers.add(5);
//        System.out.println(listToLinkedList(integers));
        List<Integer> integers = new ArrayList<>();
        integers.add(56);
        integers.add(4);
        integers.add(37);
        System.out.println(reverseNumbers(integers));
//        List<String> strings = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            strings.add("i");
//        }
//        printFirstFive(strings);

    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        List<String> list = new ArrayList<>(Arrays.asList(values));
        return list;
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը,
    // ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) {
        list.remove(index);
        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        Set<String> stringSet = new HashSet<>(list);
        return stringSet;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        List<Integer> integers = new LinkedList<>(list);

        return (LinkedList<Integer>) integers;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ,
    // որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {
        List<Integer> integers = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            integers.add(list.get(i));
        }
        return integers;

//        Queue<Integer> queue = new PriorityQueue<>(list);
//        for (Integer integer : list) {
//            System.out.println(queue.poll());
//        }
//        return list;
    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {

        System.out.println(list.subList(0, 5));
    }

    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list) {

        return list.size();
    }

}