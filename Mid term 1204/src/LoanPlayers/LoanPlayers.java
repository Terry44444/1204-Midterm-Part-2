package LoanPlayers;
import FootballPlayers.FootballPlayers;

public class LoanPlayers extends FootballPlayers{
    private String homeCountry;

    public LoanPlayers(String name, String email, int age, String cohort, String homeCountry) {
        super(name, email, age, cohort);
        this.homeCountry = homeCountry;
    }

    public LoanPlayers() {}
    

    public String getHomeCountry() {
        return homeCountry;
    }

    public void setHomeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
    }

    public void getPlayerInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Age: " + this.getAge());
        System.out.println("Team: " + this.getTeam());
        System.out.println("PlayerID: " + this.getPlayerID());
        System.out.println("Home Country "+ this.getHomeCountry());
    }
}