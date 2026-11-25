public class PercentageRule extends EligibilityRule{
    public String getRuleName(){
        return "percentage";
    }
    public boolean check(Candidate candidate,Job job){
        return candidate.getPercentage() >= job.getMinimumPercentage();
    }
}