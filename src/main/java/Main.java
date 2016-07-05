/**
 * Created by alina.vasilevska on 7/5/2016.
 */
public class Main {


    public static void main(String[] args) {

        Atm atm = new Atm();
        atm.insertCard();
        if (atm.checkPin())
            atm.selectOperation();
        else atm.showError();

    }


    public void takeMoney(){


    }

    public void giveMoney(){

    }

    public void showUserAmount(){

    }



}
