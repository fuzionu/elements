package elements;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class SetOfElements
{
    public Element getElement(String elementMark)
    {
        Set<Element> setOfElements = getAllElements();

        for (Element elementFromSet : setOfElements)
        {
            if (confirmElementMark(elementMark, elementFromSet))
            {
                return elementFromSet;
            }
        }

        throw new ElementNotFoundException();
    }

    private boolean confirmElementMark(String elementMark, Element element)
    {
        elementMark = elementMark.trim();

        return element.name.equalsIgnoreCase(elementMark) ||
                element.latinAlias.equalsIgnoreCase(elementMark) ||
                element.symbol.equalsIgnoreCase(elementMark);
    }

    private Set<Element> getAllElements()
    {
        return new HashSet<>(asList(
                new Element("Wodór", "Hydrogenium", "H", 1, "Metal", 1, 1, "Gaz", -259.198, -252.762),
                new Element("Hel", "Helium", "He", 2, "Gaz szlachetny", 18, 1, "Gaz", 0, -268.928),
                new Element("Lit", "Lithium", "Li", 3, "Metal alkaiczny", 1, 2, "Stały", 180.54, 1342)
        ));
    }
}
