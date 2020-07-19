import java.util.*; 



public class BarowoProject2 {


  public static void main(String[] args) {



    Scanner user_input = new Scanner(System.in);
    //Top 7 team of English Premier League teams
    int liverpool = 96;
    int Manc =78;
    int chelsea = 66;
    int manu = 65;
    int leicester = 62;
    int tottenham = 58;
    int wolves = 57;


    System.out.println("\nEnter the team ranking to find how many point they have\n\n");
    int teamRanking = user_input.nextInt();
    user_input.nextLine();



    switch (teamRanking) {
      case 1:
      System.out.println("liverpool rank at 1 with \n" + liverpool + "\npoints");
      break;
      case 2:
      System.out.println("Manc rank at 2 with \n" + Manc + "\npoints");
      break;
      case 3:
      System.out.println("Manc rank at 3 with \n"  + chelsea + "\npoints");
      break;
      case 4:
      System.out.println("manu rank at 4 with \n" + manu + "\npoints");
      break;
      case 5:
      System.out.println("leicester rank at 5 with \n" + leicester + "\npoints");
      break;
      case 6:
      System.out.println("tottenham rank at 6 with \n" + tottenham + "\npoints");
      break;
      case 7:
      System.out.println("wolves rank at 7 with \n" + wolves + "\npoints");
      break;
    }

    System.out.println("\nWould you like to see points of other teams?\n");

    String yesorno = user_input.nextLine();

    System.out.println("You said:" + yesorno);

   


    }
  }
