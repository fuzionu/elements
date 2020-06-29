package elements;

public class Element
{
    final String name;
    final String latinAlias;
    final String symbol;
    final int atomicNumber;
    final String metallicProperties;
    final int group;
    final int period;
    final String phase;
    final double meltingPhase;
    final double boilingPhase;

    public Element (String name, String latinAlias, String symbol, int atomicNumber, String metallicProperties, int group,
                    int period, String phase, double meltingPhase, double boilingPhase)
    {
        this.name = name;
        this.latinAlias = latinAlias;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.metallicProperties = metallicProperties;
        this.group = group;
        this.period = period;
        this.phase = phase;
        this.meltingPhase = meltingPhase;
        this.boilingPhase = boilingPhase;
    }
}
