package Projects.HW.HW7;

public class Main {
    public static void main(String[] args) {
        HW7 hw7 = new HW7();
        hw7.writeNumOfPlayersPerTeam(HW7.GameType.SOCCER, "11");
        hw7.writeNumOfPlayersPerTeam(HW7.GameType.HOCKEY, "6");
        hw7.writeNumOfPlayersPerTeam(HW7.GameType.RUGBY, "15");

    }
}
