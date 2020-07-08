package elements;

public enum MetallicProperty
{
    METAL("Metal"), HALF_METAL("Half metal"), NON_METAL("Non metal"), NOBLE_GAS("Noble gas");

    private final String metallicProperty;

    MetallicProperty(String metallicProperty)
    {
        this.metallicProperty = metallicProperty;
    }

    public String getMetallicProperty()
    {
        return metallicProperty;
    }
}
