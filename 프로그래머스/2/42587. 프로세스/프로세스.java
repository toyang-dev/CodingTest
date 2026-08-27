import java.util.*;

class Solution {
   
    public List<Node> queue = new ArrayList<>();

    public class Node {
        int priority;
        int isLocation;

        Node (int priority, int isLocation) {
            this.priority = priority;
            this.isLocation = isLocation;
        }
    }

    private Boolean idBigger(List<Node> queue, Node temp) {
        for (int i = 0; i < queue.size(); i++) {
            if (temp.priority < queue.get(i).priority) {
                queue.add(temp); 
                return true;
            }
        }
        return false;
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            if (i == location) {
                queue.add(new Node(priorities[i], 1));
            } else {
                queue.add(new Node(priorities[i], 0));
            }
        }

        while (!queue.isEmpty()) {
            Node temp = queue.remove(0); 

            if (!idBigger(queue, temp)) {
                if (temp.isLocation == 1) {
                    answer++;
                    return answer;
                }
                answer++;
            }
        }

        return -9999;
    }
}