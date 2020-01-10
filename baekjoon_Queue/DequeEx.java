
package baekjoon_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

    public class DequeEx {
        public static void main(String[] args) {
            Deque<String> dq = new ArrayDeque<String>();
            dq.add("add : 0");
            System.out.println(dq);
            dq.add("add : 1");
            System.out.println(dq);
            dq.push("push : 2");
            System.out.println(dq);
            dq.push("push : 3");
            System.out.println(dq);
            dq.offer("offer : 4");
            System.out.println(dq);
            dq.poll();
            System.out.println(dq);

            Iterator<String> e = dq.iterator();
            while (e.hasNext()) {
                System.out.println(e.next());
            }
            // peek, peekFirst, peekLast
            // get : First, Last 에 있는 Element 를 리턴 받음. (제거 x) - getFirst, getLast
            // First : poll, push
            // Last : add, offer, put
        }
    }

