package elements;

public class Element
{
    final String name;
    final String alias;
    final String symbol;
    final int atomicNumber;
    final MetallicProperties metallicProperties;
    final int group;
    final int period;
    final State state;
    final double meltingPhase;
    final double boilingPhase;

    public Element(String name, String alias, String symbol, int atomicNumber, MetallicProperties metallicProperties,
                   int group, int period, State state, double meltingPhase, double boilingPhase)
    {
        this.name = name;
        this.alias = alias;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.metallicProperties = metallicProperties;
        this.group = group;
        this.period = period;
        this.state = state;
        this.meltingPhase = meltingPhase;
        this.boilingPhase = boilingPhase;
    }
}
