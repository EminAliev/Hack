package co.example.die.mass.User;

public class PhysicalFaceImpl extends AbstractPayer implements PhysicalFace {

    @Override
    public boolean pay() {
        return false;
    }

    @Override
    public void argument() {}

    @Override
    public boolean getSalary() {
        return false;
    }
}
