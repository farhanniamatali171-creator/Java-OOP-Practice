import java.util.Arrays;

public class CricketSystem {

    // ---------------- PLAYER CLASS ----------------
    static class Player {

        private String name;
        private String role;
        private int matchesPlayed;

        private static int totalPlayers = 0;

        // Default constructor
        public Player() {
            this.name = "";
            this.role = "";
            this.matchesPlayed = 0;
            totalPlayers++;
        }

        // Parameterized constructor
        public Player(String name, String role, int matchesPlayed) {
            this.name = name;
            this.role = role;
            this.matchesPlayed = matchesPlayed;
            totalPlayers++;
        }

        // Copy constructor
        public Player(Player p) {
            this.name = p.name;
            this.role = p.role;
            this.matchesPlayed = p.matchesPlayed;
            totalPlayers++;
        }

        public static int getTotalPlayers() {
            return totalPlayers;
        }

        public String getName() {
            return name;
        }

        // toString
        @Override
        public String toString() {
            return name + " (" + role + ", Matches: " + matchesPlayed + ")";
        }

        // equals
        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (!(obj instanceof Player))
                return false;

            Player p = (Player) obj;

            return name.equals(p.name) && role.equals(p.role);
        }
    }

    // ---------------- TEAM CLASS ----------------
    static class Team {

        private String teamName;
        private Player[] players = new Player[11];
        private int playerCount = 0;

        public Team(String teamName) {
            this.teamName = teamName;
        }

        // Add player
        public void addPlayer(Player p) {

            if (playerCount < players.length) {
                players[playerCount] = p;
                playerCount++;
            } else {
                System.out.println("Team is full!");
            }
        }

        // Remove player
        public void removePlayer(String name) {

            for (int i = 0; i < playerCount; i++) {

                if (players[i].getName().equals(name)) {

                    for (int j = i; j < playerCount - 1; j++) {
                        players[j] = players[j + 1];
                    }

                    players[playerCount - 1] = null;
                    playerCount--;

                    System.out.println(name + " removed from " + teamName);
                    return;
                }
            }

            System.out.println("Player not found.");
        }

        // Get player
        public Player getPlayer(int index) {

            if (index >= 0 && index < playerCount)
                return players[index];

            return null;
        }

        // toString
        @Override
        public String toString() {

            String result = "Team: " + teamName + "\n";

            for (int i = 0; i < playerCount; i++) {
                result += players[i] + "\n";
            }

            return result;
        }
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        // Creating 15 players
        Player p1 = new Player("Babar Azam", "Batsman", 150);
        Player p2 = new Player("Shaheen Afridi", "Bowler", 145);
        Player p3 = new Player("Mohammad Rizwan", "Wicket-Keeper", 120);
        Player p4 = new Player("Shadab Khan", "All-Rounder", 110);
        Player p5 = new Player("Fakhar Zaman", "Batsman", 130);
        Player p6 = new Player("Haris Rauf", "Bowler", 100);
        Player p7 = new Player("Imad Wasim", "All-Rounder", 95);
        Player p8 = new Player("Usama Mir", "Bowler", 60);
        Player p9 = new Player("Iftikhar Ahmed", "All-Rounder", 85);
        Player p10 = new Player("Abdullah Shafique", "Batsman", 50);
        Player p11 = new Player("Mohammad Amir", "Bowler", 140);
        Player p12 = new Player("Shoaib Malik", "All-Rounder", 200);
        Player p13 = new Player("Mohammad Hafeez", "All-Rounder", 180);
        Player p14 = new Player("Abrar Ahmed", "Bowler", 40);
        Player p15 = new Player("Sarfaraz Ahmed", "Wicket-Keeper", 160);

        // Copy constructor demonstration
        Player copyPlayer = new Player(p1);

        // Creating teams
        Team teamA = new Team("Pakistan A");
        Team teamB = new Team("Pakistan B");

        // Adding players
        teamA.addPlayer(p1);
        teamA.addPlayer(p2);
        teamA.addPlayer(p3);
        teamA.addPlayer(p4);
        teamA.addPlayer(p5);

        // Aggregation (same player used in two teams)
        teamB.addPlayer(p1);
        teamB.addPlayer(p6);
        teamB.addPlayer(p7);
        teamB.addPlayer(p8);
        teamB.addPlayer(p9);

        // Print teams
        System.out.println(teamA);
        System.out.println(teamB);

        // Static counter
        System.out.println("Total Players Created: " + Player.getTotalPlayers());

        // equals demonstration
        System.out.println("p1 equals copyPlayer: " + p1.equals(copyPlayer));

        // Remove player
        teamA.removePlayer("Babar Azam");

        System.out.println("After removal:");
        System.out.println(teamA);
    }
}