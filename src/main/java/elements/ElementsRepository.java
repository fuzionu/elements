package elements;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;
import static elements.MetallicProperty.*;
import static elements.State.*;

public class ElementsRepository
{
    public Element find(String input)
    {
        for (Element elementFromSet : getAllElements())
        {
            if (isEqual(input, elementFromSet))
            {
                return elementFromSet;
            }
        }

        throw new ElementNotFoundException();
    }

    private boolean isEqual(String input, Element element)
    {
        input = input.trim();

        return element.name.equalsIgnoreCase(input) ||
                input.equalsIgnoreCase(element.alias) ||
                element.symbol.equalsIgnoreCase(input);
    }

    private Set<Element> getAllElements()
    {
        return new HashSet<>(asList(
                new Element("Hydrogen", "Hydrogenium", "H", 1, METAL, 1, 1, GAS, -259.198, -252.762),
                new Element("Helium", "He", 2, NOBLE_GAS, 18, 1, GAS, -272.20, -268.928),
                new Element("Lithium", "Li", 3, METAL, 1, 2, SOLID, 180.54, 1342),
                new Element("Beryllium", "Be", 4, METAL, 2, 2, SOLID, 1287, 2469),
                new Element("Boron", "Borium", "B", 5, HALF_METAL, 13, 2, SOLID, 2075, 4000),
                new Element("Carbon", "Carboneum", "C", 6, NON_METAL, 14, 2, SOLID, 4400, 3852),
                new Element("Nitrogen", "Nitrogenium", "N", 7, NON_METAL, 15, 2, GAS, -210.01, -195.8),
                new Element("Oxygen", "Oxygenium", "O", 8, NON_METAL, 16, 2, GAS, -218.79, -182.962),
                new Element("Fluorine", "Fluorum", "F", 9, NON_METAL, 16, 2, GAS, -219.67, -188.12),
                new Element("Neon", "Ne", 10, NOBLE_GAS, 18, 2, GAS, -248.609, -246.053),
                new Element("Mercury", "Hydrargyrum", "Hg", 80, METAL, 12, 6, LIQUID, -38.83, 357)
        ));
    }
}
