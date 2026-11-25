import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double percentage = sc.nextDouble();
        int backlog = sc.nextInt();
        int passingyear = sc.nextInt();

        Candidate candidate = new Candidate(name,percentage,backlog,passingyear);

        Job job = new Job("infosys","Java developer",65.0,0,2026);

         EligibilityChecker eli = new EligibilityChecker() ;

        EligibilityRule rule[] = {new PassingyearRule(),new BacklogRule(),new PassingyearRule()};

         System.out.println("======================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("======================================");

        System.out.println();


        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());

        System.out.println();

       boolean eligible =  eli.check(candidate,job);

   



        System.out.println();

        if(eligible){
            System.out.println("Final Result: ELIGIBLE");
        }else{
            System.out.println("Final Result: NOT ELIGIBLE");
        }


        System.out.println("================================");
        

      
    }
}
