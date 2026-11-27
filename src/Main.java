import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double percentage = sc.nextDouble();
        int backlog = sc.nextInt();
        int passingyear = sc.nextInt();
        int skillCount = sc.nextInt();

        String[] skill = new String[skillCount];

        for(int i = 0;i<skill.length;i++){
            skill[i] = sc.next();
        }

        Candidate candidate = new Candidate(name,percentage,backlog,passingyear,skill);

        int jobCount = sc.nextInt();
        Job[] jobs = new Job[jobCount];

        for(int i = 0;i<jobCount;i++){
            String company = sc.next();
            String role = sc.next();
            double minimumPercentage = sc.nextDouble();
            int maximumBacklogs = sc.nextInt();
            int requiredGraduationYear  = sc.nextInt();

            int requiredSkillCount = sc.nextInt();
            String[] requiredSkills = new String[requiredSkillCount];

            for(int j = 0;j<requiredSkillCount;j++){
                requiredSkills[j] = sc.next();

            }

            jobs[i] = new Job(
                company,role,minimumPercentage,maximumBacklogs,requiredGraduationYear,requiredSkills
            );

        }
         System.out.println();
        System.out.println("AVAILABLE JOBS");
        for(int i=0;i<jobs.length;i++){
            System.out.println(
                (i+1) + ". "+
                jobs[i].getCompany()+
                "-"+
                jobs[i].getRole()
            );
        }
          int selectedJobNumber = sc.nextInt();
        Job selectedJob = jobs[selectedJobNumber -1];


        
        // Job selectedJob = jobs[0];

         EligibilityChecker eli = new EligibilityChecker() ;

        // EligibilityRule rule[] = {new PassingyearRule(),new BacklogRule(),new PassingyearRule()};

         System.out.println("======================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("======================================");

        System.out.println();
        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company : " + selectedJob.getCompany());
        System.out.println("Role : " + selectedJob.getRole());

        



        System.out.println();

       boolean eligible =  eli.check(candidate,selectedJob);

   



        System.out.println();

        if(eligible){
            System.out.println("Final Result: ELIGIBLE");
        }else{
            System.out.println("Final Result: NOT ELIGIBLE");
        }


        System.out.println("================================");
        

      
    }
}
