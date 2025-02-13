package MapAndQueuePractice.DesignVotingSystem;
import java.util.*;
class VotingSystem{
    private Map<String, Integer> voteMap = new HashMap<>();
    private Map<String, Integer> orderedVotes = new LinkedHashMap<>();
    private TreeMap<String, Integer> sortedVotes = new TreeMap<>();

    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        orderedVotes.put(candidate, voteMap.get(candidate));
        sortedVotes.put(candidate, voteMap.get(candidate));
    }

    public void displayVotes() {
        System.out.println("Votes in Insertion Order (LinkedHashMap):");
        for (Map.Entry<String, Integer> entry : orderedVotes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void displaySortedResults() {
        System.out.println("Sorted Vote Results (TreeMap):");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}