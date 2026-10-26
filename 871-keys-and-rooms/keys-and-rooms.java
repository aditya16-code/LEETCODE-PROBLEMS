
import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

        List<Set<Integer>> sets = new ArrayList<>();

        // Convert every sublist into a Set
        for (List<Integer> room : rooms) {
            sets.add(new HashSet<>(room));
        }

        boolean[] visited = new boolean[n];

        dfs(0, sets, visited);

        for (boolean v : visited) {
            if (!v) {
                return false;
            }
        }

        return true;
    }

    private void dfs(int room, List<Set<Integer>> sets,
                     boolean[] visited) {
        visited[room] = true;

        // Check keys of the current room
        for (int nextRoom : sets.get(room)) {
            if (!visited[nextRoom]) {
                dfs(nextRoom, sets, visited);
            }
        }
    }
}
