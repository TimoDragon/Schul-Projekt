import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fight {
    private Enemy enemy;
    private Game game;
    private List<Weapon> weapons = new ArrayList<Weapon>();
    private String firstPronoun, secondPronoun = "";

    //start the fight
    public void startFight(Player player, Game runningGame) {
        String fightStartMessage = "Du kommt in einen Kampf mit " + firstPronoun + " " + enemy.getName() + "\n";
        String fightStartMessage2 = "";

        for (char ch : fightStartMessage.toCharArray()) {
            fightStartMessage2 = fightStartMessage2 + "~";
        }

        Main.animation(fightStartMessage2 + "\n", 25);
        Main.animation(fightStartMessage, 25);
        Main.animation(fightStartMessage2 + "\n", 25);

        game = runningGame;

        for (int i = 0; i < player.getInventory().size(); i++) {
            if (player.getInventory().get(i).getClass().getName().equals("Weapon")) {
                weapons.add(player.getInventory().get(i).toWeapon());
            }
        }

        for (int i = 0; i < weapons.size(); i++) {
            Main.animation("("+ i +") " + weapons.get(i).getName() + "\n", 10);
        }

        requestFightInput(player);
    }

    //set the enemy
    public void setEnemy(Enemy in) {
        enemy = in;
    }

    //get the enemy
    public Enemy getEnemy() {
        return enemy;
    }

    //input during a fight
    public void onInput(int in, Player player) {
        if (in < weapons.size()) {
            Weapon weapon = weapons.get(in);

            enemy.setHealth(enemy.getHealth() - weapon.getDamage());

            boolean wasEnemy = false;
            checkHealth(player, enemy, wasEnemy);
        }
        else {
            requestFightInput(player);
        }
    }

    //enemy attack back
    public void enemyAttack(Player player, Enemy enemy) {
        boolean wasEnemy = true;
        int max = enemy.getWeapons().size();
        int min = 1;
        int random = (int) Math.floor(Math.random()*(max-min+1));
        Weapon weapon = enemy.getWeapons().get(random);

        Main.animation(secondPronoun + " " + enemy.getName() + " greift dich mit " + weapon.getName() + " an\nDu erleidest "
                        + weapon.getDamage() + " Schaden\n", 25);
        player.setHealth(player.getHealth() - weapon.getDamage());

        checkHealth(player, enemy, wasEnemy);
        requestFightInput(player);
    }

    //to request fight input
    public void requestFightInput(Player player) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //sc.close();
        onInput(input, player);
    }

    //checks player and enemy health and outputs it
    public void checkHealth (Player player, Enemy enemy, boolean wasEnemy) {
        if (player.getHealth() > 0 && enemy.getHealth() > 0) {
            Main.animation("----\n", 25);
            Main.animation("Deine Leben: " + player.getHealth() + "\n", 20);
            Main.animation(enemy.getName() + " Leben: " + enemy.getHealth() + "\n", 20);
            Main.animation("----\n", 25);

            if (wasEnemy == false) {
                enemyAttack(player, enemy);
            }
        }
        else if (player.getHealth() <= 0) {
            //if the Player dies maxbe add something
        }
        else if (enemy.getHealth() <= 0) {
            Main.animation("*************************\n", 25);
            Main.animation(enemy.getName() + " ist besiegt. Du hast gewonnen!\n", 25);
            Main.animation("*************************\n", 25);

            game.fighting = false;
            game.startGame(game);
        }
    }

    //change pronouns
    public void setPronouns(String first, String second) {
        firstPronoun = first;
        secondPronoun = second;
    }
}