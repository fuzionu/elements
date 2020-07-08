package elements;

public enum State
{
    GAS("Gas"), SOLID("Solid"), LIQUID("Liquid");

    private final String state;

    State(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }
}
