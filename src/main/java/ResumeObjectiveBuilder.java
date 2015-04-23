import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by kyle on 4/15/15.
 */
public class ResumeObjectiveBuilder {

    // Populate our lists of each sentence component.
    private List<String> adjectives = Arrays.asList("Determined", "Hard-working", "Diligent", "Trustworthy",
            "Team-player", "Motivated", "Reliable", "Self-starter", "Loyal", "Studious", "Attentive", "Conscientious",
            "Industrious", "Persistent", "Dynamic", "Energetic", "Enterprising", "Enthusiastic", "Aggressive",
            "Consistent", "Organized", "Professional", "Methodical", "Skillful", "Passionate");

    private List<String> objectives = Arrays.asList("seeking a position", "looking for a role");

    private List<String> names = Arrays.asList("person","individual","hard-worker");


    String build(){
        String sentence = "A " + getAdjective().toLowerCase() + " " + getName() + " " + getObjective() + " with a " + getAdjective().toLowerCase() + " company.";
        return sentence;
    }

    String getAdjective(){
        // Shuffle the list then fetch the first one. This does not guarantee uniqueness, which is an issue / future improvement.
        Collections.shuffle(adjectives);
        String adjective = adjectives.get(0);
        // TODO: Remove the one we just took, so its gone from the array.
        return adjective;
    }

    String getObjective(){
        Collections.shuffle(objectives);
        String objective = objectives.get(0);
        return objective;
    }

    String getName(){
        Collections.shuffle(names);
        String name = names.get(0);
        return name;
    }

}