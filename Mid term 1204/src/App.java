import java.util.*;

import FootballPlayers.FootballPlayers;
import LoanPlayers.LoanPlayers;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===============================");
        System.out.println("Welcome to Football Players Management System");
        System.out.println("===============================");

        showOptions();
    }

    public static void showOptions() {
        Scanner sc = new Scanner(System.in);
        FootballPlayers defaultPlayer = new FootballPlayers("Cristiano Ronaldo", "cr7@gmail.com", 38, "Al Nassr");
        LoanPlayers loanPlayers = new LoanPlayers("Lionel Messi", "messi10@gmail.com", 35, "Paris Saint Germain", "Argentina");


        String option = "0";
        List<FootballPlayers> playerList = new ArrayList<>();
        List<LoanPlayers> loanPlayersList = new ArrayList<>();
        playerList.add(defaultPlayer);
        loanPlayersList.add(loanPlayers);

        do {
            System.out.println("===============================");
            System.out.println("1. Show all Players");
            System.out.println("2. Add Players");
            System.out.println("3. Add Loan Players");
            System.out.println("4. Exit!!!");
            System.out.println("===============================");

            System.out.println("Please choose an option");

            option = sc.next();

            System.out.println();
            System.out.println(option + " IS YOUR OPTION");

            switch(option) {
                case "1":
                    System.out.println("You choose to show all players");
                    showAllPlayers(playerList, loanPlayersList);
                    break;
                case "2": 
                    System.out.println("===============================");
                    System.out.println("You choose to add Loan Player");
                    FootballPlayers newplayer = new FootballPlayers();
                    newplayer = enterPlayerDetails();

                    playerList.add(newplayer);
                        
                    break;
                
                case "3":
                    System.out.println("===============================");
                    System.out.println("You choose to add Loan Player");
                    LoanPlayers newloanPlayers = new LoanPlayers();
                    newloanPlayers = enterLoanPlayersDetails();

                    loanPlayersList.add(newloanPlayers);
                    break;
                    
                case "4":
                    System.out.println("GOODBYE");
                    sc.close();

                    break;

                default:
                    System.out.println("I am confused");
                    break;
                
            }

        } while(!option.equals("4"));
        System.out.println("Thank you for using our platform");
    }
    public static void showAllPlayers(List<FootballPlayers> playerList, List<LoanPlayers> loanPlayerList) {
        for (FootballPlayers player: playerList){
            System.out.println("*********************");
            player.getPlayerInfo();
            System.out.println("*********************");
        }

        for (LoanPlayers student: loanPlayerList){
            System.out.println("*********************");
            student.getPlayerInfo();
            System.out.println("*********************");
        }
    }

    public static FootballPlayers enterPlayerDetails() {
        Scanner sc2 = new Scanner(System.in);
        String name = "";
        String email = "";
        int age =0;
        String team = "";
        
        System.out.println("Enter Player name: ");
        name = sc2.next();

        System.out.println("Enter Player email: ");
        email = sc2.next();

        System.out.println("Enter Player age: ");
        age = sc2.nextInt();

        System.out.println("Enter Player team: ");
        team = sc2.next();

        
        FootballPlayers newPlayer = new FootballPlayers(name, email, age, team);
        return newPlayer;


    }

    public static LoanPlayers enterLoanPlayersDetails() {
        Scanner sc3 = new Scanner(System.in);
        String name = "";
        String email = "";
        int age =0;
        String team = "";
        String homeCountry = "";
        
        System.out.println("Enter Player name: ");
        name = sc3.next();

        System.out.println("Enter Player email: ");
        email = sc3.next();

        System.out.println("Enter Player age: ");
        age = sc3.nextInt();

        System.out.println("Enter Player team: ");
        team = sc3.next();

        
        System.out.println("Enter Player home country: ");
        homeCountry = sc3.next();

        
        LoanPlayers newPlayers = new LoanPlayers(name, email, age, team, homeCountry);
        return newPlayers;


    }

    
}
