package Homework.BraceChecker;

public class BraceChecker {
    private String text;
    private final Stake stake = new Stake();
    private final Stake stakeForIndex = new Stake();


    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            int pop;
            switch (a) {
                case '(':
                case '{':
                case '[':
                    stake.push(a);
                    stakeForIndex.push(i);
                    break;
                case ')':
                    pop = stake.pop();
                    stakeForIndex.pop();
                    if (pop == 0) {
                        System.out.println("error closed" + a + "but not opened at" + i);
                    } else if (pop != '(') {
                        System.out.println("error closed:" + a + "but opened" + (char) pop + "at" + i);
                    }
                    break;
                case '}':
                    pop = stake.pop();
                    stakeForIndex.pop();
                    if (pop == 0) {
                        System.out.println("error closed" + a + "but not opened at" + i);
                    } else if (pop != '{') {
                        System.out.println("error closed:" + a + "but opened" + (char) pop + "at" + i);
                    }
                    break;
                case ']':
                    pop = stake.pop();
                    stakeForIndex.pop();
                    if (pop == 0) {
                        System.out.println("error closed" + a + "but not opened at" + i);
                    } else if (pop != '[') {
                        System.out.println("error closed:" + a + "but opened" + (char) pop + "at" + i);
                    }
                    break;
            }
//            int last;
//            while ((last=stake.pop()) != 0)
//                System.out.println("error opened" + (char)last + "but not closed");
            while (!stake.isEmpty()) {
                System.out.println("error opened" + (char) stake.pop() + "but not closed at" + stakeForIndex.pop());
            }
        }
    }
}