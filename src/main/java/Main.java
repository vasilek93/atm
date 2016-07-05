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
                takeMoney(atm);
            if (atm.selectOperation().equals("Take Money"))
                showUserAmount(atm);
        }
        else atm.showError();

    }


    public static void takeMoney(Atm atm){
        if (atm.checkAmount()){
            atm.withdraw();

        }


    }

    public static void giveMoney(Atm atm){

    }

    public static void showUserAmount(Atm atm){

    }



}
