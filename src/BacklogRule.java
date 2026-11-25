
   public class BacklogRule extends EligibilityRule{
    public String getRuleName(){
        return "Backlog";
    }

    public boolean check(Candidate candidate,Job job){
        return candidate.getBacklog() <= job.getMaximumBacklogs();
    }
    
}
