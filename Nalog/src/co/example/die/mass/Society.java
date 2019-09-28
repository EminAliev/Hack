package co.example.die.mass;

import co.example.die.mass.User.Minister;
import co.example.die.mass.User.Payer;

import java.util.TreeSet;

public class Society {

    //в каждой сессии только один чиновник
    Minister minister;
    //множество всех плательщиков
    TreeSet<Payer> payers;
    //множество заплативших
    TreeSet<Payer> mustPay;

    //при создании игры добавляет игроков
    private <P extends Payer> boolean addPayer(P payer) {
        return this.payers.add(payer);
    }

    //добавляет всех плательщиков в перечень тех, кто должен заплатить налог, логическое начало месяца
    private void beginOfMonth() {
        mustPay.clear();
        mustPay.addAll(payers);
    }

    //когда плательщик заплатил, удаляет его из списка должников
    public boolean payed(Payer p) {
        return this.mustPay.remove(p);
    }



}
