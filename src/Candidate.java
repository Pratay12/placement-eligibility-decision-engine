public class Candidate {
    private String name;
    private double percentage;
    private int backlog;
    private int passingyear;
    private String[] skills;

    Candidate(String name,double percentage,int backlog,int passingyear,String[] skills){
        this.name = name;
        this.percentage = percentage;
        this.backlog = backlog;
        this.passingyear = passingyear;
        this.skills = skills;
    }

    public String getName(){
        return name;
    }
    public double getPercentage(){
        return percentage;
    }
    public int getBacklog(){
        return backlog;
    }
    public int getPassingyear(){
        return passingyear;
    }
    public boolean hasSkill(String requiredSkill){
        for(int i =0;i <skills.length;i++){
            if(skills[i].equalsIgnoreCase(requiredSkill)){
                return true;
            }
        }
        return false;
    }

    
}