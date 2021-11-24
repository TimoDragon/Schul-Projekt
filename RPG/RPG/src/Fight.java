import java.util.HashMap;
import java.util.Scanner;

public class Fight {
    Enemy enemy;
    boolean hasSword, hasAxe, hasShield;
    private HashMap<Integer, String> equip = new HashMap<Integer, String>();

    //start the fight
    public void startFight(Player player) {
        Main.animation("~~~~~~~~~~~~~~~~~~~~~~~~~\n", 25);
        Main.animation("Du kommt in einen Kampf mit " + enemy.getName() + "\n", 20);
        Main.animation("~~~~~~~~~~~~~~~~~~~~~~~~~\n", 25);

        for (int i = 0; i < player.getInventory().size(); i++) {
            if (player.getInventory().get(i).getType().equals("Sword")) {
                hasSword = true;
            }
            else if (player.getInventory().get(i).getType().equals("Axe")) {
                hasAxe = true;
            }
            else if (player.getInventory().get(i).getType().equals("Shield")) {
                hasShield = true;
            }
        }

        int inputNum = 1;
        if (hasSword == true) {
            Main.animation(inputNum + " um mit dem Schwert zu schlagen\n", 25);
            equip.put(inputNum, "Sword");
            inputNum = inputNum + 1;
        }
        if (hasAxe == true) {
            Main.animation(inputNum + " um mit der Axt zu schlagen\n", 25);
            equip.put(inputNum, "Axe");
            inputNum = inputNum + 1;
        }
        if (hasShield == true) {
            Main.animation(inputNum + " um mit dem Schild zu blocken\n", 25);
            equip.put(inputNum, "Shield");
            inputNum = inputNum + 1;
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
    public void input(int in, Player player) {
        if (equip.containsKey(in)) {
            String itemName = equip.get(in);

            switch (itemName) {
                case "Sword": {
                    enemy.setHealth(enemy.getHealth() - 10);
                    Main.animation("Du hast " + enemy.getName() + " 10 Schaden hinzugefügt\n", 25);
                    break;
                }
                case "Axe": {
                    break;
                }
                case "Shield": {
                    break;
                }
            }

            if (player.getHealth() > 0 && enemy.getHealth() > 0) {
                Main.animation("----\n", 25);
                Main.animation("Deine Leben: " + player.getHealth() + "\n", 20);
                Main.animation(enemy.getName() + " Leben: " + enemy.getHealth() + "\n", 20);
                Main.animation("----\n", 25);

                requestFightInput(player);
            }
        }
        else {
            requestFightInput(player);
        }
    }

    //enemy attack back
    public void enemyAttack(Player player, Enemy enemy) {
        
    }

    //to request fight input
    public void requestFightInput(Player player) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        onFightInput(input, player);
        sc.close();
    }

    //for fight input
    public void onFightInput(int in, Player player) {
        switch(in) {
            case 0: {
                Main.printInv(player);
                requestFightInput(player);
                break;
            }
            case 1: {
                input(in, player);
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                break;
            }
        }
    }
}