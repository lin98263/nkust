public class person {
    public static void main(String[] args) {
        game Merlin = new game(30, 400, 1000);
        Merlin.getCurrentStatus();
        Merlin.weapon = "crutch";
        Merlin.Moves = "lightning";
        Merlin.name = "Merlin";
        Merlin.ShoutMyName();
        game Arthur = new game(2000, 50, 100);
        Arthur.getCurrentStatus();
        Arthur.name = "Arthur";
        Arthur.weapon = "sword";
        Arthur.Moves = "Sprint";
        Arthur.ShoutMyName();
        game Robinhood = new game(100, 200, 500);
        Robinhood.getCurrentStatus();
        Robinhood.name = "Robinhood";
        Robinhood.weapon = "bow";
        Robinhood.Moves = "Continuous shooting";
        Robinhood.ShoutMyName();
    }
}