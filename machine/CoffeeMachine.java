package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

aa:
        while (true) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");

            String action = reader.next();

            switch (action) {
                case "buy":
                    int i = 1;
                    do {
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                        String buy = reader.next();
                        String n = null;

                        switch (buy) {
                            case "1":
                                if (water >= 250 && beans >= 16 && cups >= 1) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    water -= 250;
                                    beans -= 16;
                                    money += 4;
                                    cups -= 1;
                                } else {
                                    if (water < 250) {
                                        n = "water";
                                    } else if (beans < 16) {
                                        n = "beans";
                                    } else if (cups == 0) {
                                        n = "cups";
                                    }
                                    System.out.println("Sorry, not enough " + n + "!");
                                }

                                i = 0;
                                break;
                            case "2":
                                if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    water -= 350;
                                    milk -= 75;
                                    beans -= 20;
                                    money += 7;
                                    cups -= 1;
                                } else {
                                    if (water < 350) {
                                        n = "water";
                                    } else if (milk < 75) {
                                        n = "milk";
                                    } else if (beans < 20) {
                                        n = "beans";
                                    } else if (cups == 0) {
                                        n = "cups";
                                    }
                                    System.out.println("Sorry, not enough " + n + "!");
                                }

                                i = 0;
                                break;

                            case "3":
                                if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    water -= 200;
                                    milk -= 100;
                                    beans -= 12;
                                    money += 6;
                                    cups -= 1;
                                } else {
                                    if (water < 200) {
                                        n = "water";
                                    } else if (milk < 100) {
                                        n = "milk";
                                    } else if (beans < 12) {
                                        n = "beans";
                                    } else if (cups == 0) {
                                        n = "cups";
                                    }
                                    System.out.println("Sorry, not enough " + n + "!");
                                }
                                i = 0;
                                break;

                            case "back":
                                i = 0;
                                break;
                        }
                    } while (i == 1);
                    break;

                case "fill":

                    System.out.println("Write how many ml of water do you want to add:");
                    int addWater = reader.nextInt();
                    water += addWater;

                    System.out.println("Write how many ml of milk do you want to add:");
                    int addMilk = reader.nextInt();
                    milk += addMilk;

                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int addBeans = reader.nextInt();
                    beans += addBeans;

                    System.out.println("Write how many disposable cups of coffee do you want to add: \n");
                    int addCups = reader.nextInt();
                    cups += addCups;
                    break;

                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;

                case "remaining":
                    System.out.println("The coffee machine has:\n" +
                            water + " of water\n" +
                            milk + " of milk\n" +
                            beans + " of coffee beans\n" +
                            cups + " of disposable cups\n" +
                            money + " of money");
                    break;

                case "exit":
                    break aa;

            }
        }
    }
}
