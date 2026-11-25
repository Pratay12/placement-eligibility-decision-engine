public class Candidate {
    private String name;
    private double percentage;
    private int backlog;
    private int passingyear;

    Candidate(String name,double percentage,int backlog,int passingyear){
        this.name = name;
        this.percentage = percentage;
        this.backlog = backlog;
        this.passingyear = passingyear;
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

    
}