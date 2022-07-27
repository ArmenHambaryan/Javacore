package Homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();


    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    public static  void  createFootballTeam(List<FootballTeamMember> members) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        for (FootballTeamMember member : members) {
            System.out.println(member.name+ member.number);
        }

    }


    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        memberMap.remove(removedNumber);

        return false;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        Map<Integer, String> stringMap = new HashMap<>();
        for (String value : memberMap.values()) {
            System.out.println(value);
        }
    }


    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
// 11 - Poxos Poxosyan
// 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        Set<Map.Entry<Integer, String>> entries = memberMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + entry.getValue());
        }

    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}