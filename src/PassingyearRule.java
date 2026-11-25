
   class PassingyearRule extends EligibilityRule{
    public String getRuleName(){
        return "passing year";
    }

    public boolean check(Candidate candidate,Job job){
        return candidate.getPassingyear() >= job.getGraduationYear();
    }
}