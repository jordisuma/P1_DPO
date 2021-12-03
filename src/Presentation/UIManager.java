package Presentation;

import Business.Manager.ProvaManager;

import java.awt.*;
import java.util.Scanner;

public abstract class UIManager {

    public static final String SHOW_MENU_COMPOSITOR = "\t1) Manage Trials\n\t2) Manage Editions\n\n\t3) Exit\n\nEnter an option:";
    public static final String ENTER_OPTION = "Enter an option";
    public static final String ERROR_WRONG_OPTION = "Error, opcio incorrecte";

    public static final String SHOW_MENU_MANAGE_TRIALS = "-- Trial Types--\n\t1) Paper publication\nEnter the trials type";

    MenuCompositor menuCompositor = new MenuCompositor();
    ProvaManager provaManager = new ProvaManager();

    public MenuCompositor mostraCompositorMenu() {
        int opcio = 0;
        System.out.println("Entering management mode...\n");
        System.out.println(SHOW_MENU_COMPOSITOR);
        System.out.println(ENTER_OPTION);


        try {
            Scanner sc = new Scanner(System.in);
            switch (opcio) {
                case 1:
                    return  menuCompositor.manageTrials();
                case 2:
                    return menuCompositor.manageEditions();
                case 3:
                    System.out.println("Sortint...");
                    break;
                default:
                    System.out.println(ERROR_WRONG_OPTION);
            }
        } catch (NumberFormatException e) {


        }
        public void mostraConductorMenu() {
            System.out.println("Entering ");


        }

        public void mostraMenuManageTrials(){
            System.out.println(SHOW_MENU_MANAGE_TRIALS);
            Scanner sc = new Scanner(System.in);
            switch (opcio){
                case 1: return provaManager.crearProva();//WTF
                default:
                    System.out.println(ERROR_WRONG_OPTION);
            }
        }
    }
}
