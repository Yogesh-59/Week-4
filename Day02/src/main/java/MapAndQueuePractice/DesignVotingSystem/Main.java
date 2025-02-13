package MapAndQueuePractice.DesignVotingSystem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Deepraj ");
        votingSystem.castVote("Aryan");
        votingSystem.castVote("Bipin");
        votingSystem.castVote("Durgesh");
        votingSystem.castVote("Akancha");
        votingSystem.castVote("Rishi");

        votingSystem.displayVotes();
        votingSystem.displaySortedResults();
    }
}
