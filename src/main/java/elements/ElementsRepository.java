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
                element.alias.equalsIgnoreCase(input) ||
                element.symbol.equalsIgnoreCase(input);
    }

    private Set<Element> getAllElements()
    {
        return new HashSet<>(asList(
                new Element("Hydrogen", "Hydrogenium", "H", 1, METAL, 1, 1, GAS, -259.198, -252.762),
                new Element("Helium", "", "He", 2, NOBLE_GAS, 18, 1, GAS, 0, -268.928),
                new Element("Lithium", "", "Li", 3, METAL, 1, 2, SOLID, 180.54, 1342)
        ));
    }
}
