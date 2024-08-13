package abstratcfactory;


public class DarkUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new DarkButtons();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}