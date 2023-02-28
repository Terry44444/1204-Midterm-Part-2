package FootballPlayers;
import java.util.UUID;

public class FootballPlayers {
    
    private String name;
    private String email;
    private int age;
    private String team;
    private String playerID;

    public FootballPlayers() {
        this.name = "Cristiano Ronaldo";
        this.email = "cr7@gmail.com";
        this.age = 38;
        this.team = "Al Nassr";
        this.playerID = UUID.randomUUID().toString();        
    }


    public FootballPlayers(String name, String email, int age, String team) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.team = team;
        this.playerID = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public void getPlayerInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Age: " + this.getAge());
        System.out.println("Team: " + this.getTeam());
        System.out.println("PlayerID: " + this.getPlayerID());
    }

    public void getPlayerInfo(int course) {
        System.out.println("Name: " + this.getName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Age: " + this.getAge());
        System.out.println("Team: " + this.getTeam());
        System.out.println("PlayerID: " + this.getPlayerID());
       
    }
}