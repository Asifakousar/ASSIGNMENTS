package abstratcfactory;

public class DarkButtons implements Button{
    @Override
    public void render() {
        System.out.println("Rendering Dark Button");
    }
}