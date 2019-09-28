package co.example.die.mass;

import co.example.die.mass.User.Minister;
import co.example.die.mass.User.Payer;

import java.util.TreeSet;

public class Society {

    Minister minister = new Minister();
    TreeSet<Payer> payers;
    TreeSet<Payer> mustPay;

    //при создании игры добавляет игроков
    private <P extends Payer> boolean addPayer(P payer) {
        return this.payers.add(payer);
    }

    //добавляет всех ботов в перечень тех, кто должен заплатить налог
    private void endOfMonth() {
        mustPay.clear();
        mustPay.addAll(payers);
    }

    //когда бот заплатил, удаляет его из списка должников
    public boolean payed(Payer p) {
        return this.mustPay.remove(p);
    }
    

}
