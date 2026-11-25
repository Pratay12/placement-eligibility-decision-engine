public class EligibilityChecker {

     EligibilityRule rule[] = {new PercentageRule(),new BacklogRule(),new PassingyearRule()};



    public boolean check(Candidate candidate,Job job){
         boolean eligible = true;

        for(int i = 0;i < rule.length;i++){
            boolean pass = rule[i].check( candidate,  job);

            if(pass){
                System.out.println(rule[i].getRuleName() + ":  Pass");
            }else{
                System.out.println(rule[i].getRuleName() + ":  Fail");
                eligible = false;
            }
        }
        return eligible;

    };
    
}
