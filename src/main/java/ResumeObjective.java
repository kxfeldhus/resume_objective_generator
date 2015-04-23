/**
 * Created by kyle on 4/15/15.
 */
public class ResumeObjective {

    public static void main(String[] args){
        ResumeObjectiveBuilder builder = new ResumeObjectiveBuilder();
        String objective = builder.build();

        System.out.println(objective);
    }
}
