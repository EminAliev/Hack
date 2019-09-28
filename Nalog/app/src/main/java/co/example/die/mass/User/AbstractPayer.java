package co.example.die.mass.User;

public class AbstractPayer implements Payer {

    String[] property;

    @Override
    public boolean pay() {
        return false;
    }

    @Override
    public void argument() {

    }

    @Override
    public boolean getSalary() {
        return false;
    }
}
