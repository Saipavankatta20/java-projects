import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Lets play rock paper scissors");
        System.out.println("When i say shoot,Choose:rock paper scissors");
        System.out.println("Are you ready? Write 'yes' if you are ");
        String option=scan.nextLine();
        if(option.equals("yes")){
            System.out.println("Great!");
            System.out.println("rock--paper--scissors,shoot!");
            String yourchoice=scan.nextLine();
            String compchoice=computerChoice();
            String RESULT=result(yourchoice, compchoice);
            printResult(yourchoice, compchoice, RESULT);
        }
        else{
            System.out.println("Darn,some other time...!");
        }
        scan.close();

    }
    
    public static String computerChoice()
    {
        double randomNumber=Math.random()*2;
        randomNumber+=1;
        String choice;
        switch((int)randomNumber){
            case 1:choice="rock";break;
            case 2:choice="paper";break;
            case 3:choice="scissors";break;
            default:choice="null";

        }
        return choice;
    }
    public static String result(String yourchoice,String compchoice)
    {
        String outcome=" ";
        if((yourchoice.equals("rock")&&compchoice.equals("scissors"))||(yourchoice.equals("paper")&&compchoice.equals("rock"))||(yourchoice.equals("scissors")&&compchoice.equals("paper")))
        {
            outcome="You win!";
        }
        if((yourchoice.equals("scissors")&&compchoice.equals("rock"))||(yourchoice.equals("rock")&&compchoice.equals("paper"))||(yourchoice.equals("paper")&&compchoice.equals("scissors")))
        {
            outcome="You lose!";

        }
        if(yourchoice.equals(compchoice)){
            outcome="Its a tie";
        }
        return outcome;
        
    }
    public static void  printResult(String yourchoice, String compchoice,String RESULT)
    {
        System.out.println("You chose:  "+yourchoice);
        System.out.println("The computer chose:  "+compchoice);
        System.out.println(RESULT);

    }


    }
    

