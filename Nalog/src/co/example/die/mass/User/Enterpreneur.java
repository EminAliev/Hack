package co.example.die.mass.User;

public class Enterpreneur extends AbstractPayer implements JuridicalFace {


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
