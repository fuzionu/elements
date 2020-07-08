package elements;

public class ElementInfoFormatter
{
    public String formatInfo(Element element)
    {
        return "Name: " + element.name + "\n" +
                "Alias: " + isAliasEmpty(element) + "\n" +
                "Symbol: " + element.symbol + "\n" +
                "Atomic number: " + element.atomicNumber + "\n" +
                "Metallic property: " + element.metallicProperty.getMetallicProperty() + "\n" +
                "Group: " + element.group + "\n" +
                "Period: " + element.period + "\n" +
                "State: " + element.state.getState() + "\n" +
                "Melting phase: " + element.meltingPhase + " °C\n" +
                "Boiling phase: " + element.boilingPhase + " °C";
    }

    private String isAliasEmpty(Element element)
    {
        if (element.alias.isEmpty())
        {
            return "-";
        }

        return element.alias;
    }
}
