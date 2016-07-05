import java.util.Scanner;

/**
 * Created by alina.vasilevska on 7/5/2016.
 */
public class Main {

    public static void main(String[] args) {
        Atm atm = new Atm();
        Card card = new Card();
        atm.insertCard();
        atm.askForPin();

        if (atm.checkPin()) {
            atm.askForOperation();
            if (atm.selectOperation().equals("Give Money"))
                getMoney(atm);
            else
            if (atm.selectOperation().equals("Add Money"))
                addMoney(atm);
            else
            if (atm.selectOperation().equals("Show Amount"))
                showUserAmount(atm);
            else atm.showError("Incorrect operation!");

        }
        else atm.showError("Incorrect pin!");

    }


    public static void addMoney(Atm atm){
        atm.askForAmount();
        atm.addMoney();

    }

    public static void getMoney(Atm atm){
        atm.askForAmount();
        if (atm.checkAmount()){
            atm.withdraw();
        }
        else {
            atm.showError("Not enough money!");
        }
    }

    public static void showUserAmount(Atm atm){
        atm.getAvailableAmount();
    }

}
