package ru.job4j;

import java.util.*;

public class TmpClass {
    public static void main(String[] args) {
        /**
         * List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
         * List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
         * String[] strArray = nameList.toArray(new String[]);
         * System.out.println(strArray[0]);
         * List<GreekLetter> letterList = new ArrayList<>();
         * letterList.add(new GreekLetter("Gamma",  3));
         * letterList.add(new GreekLetter("Omega", 24));
         * Object[] arr = letterList.toArray(new Object[0]);
         * Scanner scan = new Scanner(System.in);
         *
         * */
        List<Integer> list = new ArrayList<>();

        /**
        *    list.add(scan.nextInt());
        * System.out.println("Start");
        * Scanner scan = new Scanner(System.in);
        * String input = "1 2 3 4 5"; scan.nextLine();
        * List<String> numArray = new ArrayList<>(Arrays.asList(input.split(" ")));
        * System.out.println(input);
        * System.out.println(numArray);
        * Queue<Integer> queue = new ArrayDeque<>();
        * Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
        */

        Deque<String> states = new ArrayDeque<String>();
        states.add("Germany");
        states.add("France");
        states.offerLast("Norway");

        System.out.println(states);

        /**
        states.offerLast("Norway");
        queue.add(5);
        queue.add(0);
        queue.add(1);
        queue.add(7);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
         */
    }

    static class GreekLetter {
        private String letter;
        private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{"
                    + "letter='" + letter + '\''
                    + ", position=" + position
                    + '}';
        }
    }
}
