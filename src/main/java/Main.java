/**
 * Created by alina.vasilevska on 7/5/2016.
 */
public class Main {

    public static void main(String[] args) {
        Atm atm = new Atm();

        atm.insertCard();
        if (atm.checkPin()) {
            if (atm.selectOperation().equals("Give Money"))
                giveMoney(atm);
            if (atm.selectOperation().equals("Take Money"))
                addMoney(atm);
            if (atm.selectOperation().equals("Take Money"))
                showUserAmount(atm);
        }
        else atm.showError();

    }


    public static void addMoney(Atm atm){
        atm.addMoney();

    }

    public static void giveMoney(Atm atm){
        if (atm.checkAmount()){
            atm.withdraw();
        }
        else {
            atm.showError();
        }
    }

    public static void showUserAmount(Atm atm){
        atm.getAvailableAmount();
    }

}
