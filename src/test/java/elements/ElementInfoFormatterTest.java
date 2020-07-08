package elements;

import org.junit.jupiter.api.Test;

import static elements.MetallicProperty.*;
import static elements.State.*;
import static org.junit.jupiter.api.Assertions.*;

class ElementInfoFormatterTest
{
    @Test
    void shouldFormatElementInfo()
    {
        // given
        Element element = new Element("Hydrogen", "Hydrogenium", "H", 1, METAL, 1, 1, GAS, -259.198, -252.762);

        // when
        String actual = new ElementInfoFormatter().formatInfo(element);

        // then
        assertEquals("Name: Hydrogen\n" +
                "Alias: Hydrogenium\n" +
                "Symbol: H\n" +
                "Atomic number: 1\n" +
                "Metallic property: Metal\n" +
                "Group: 1\n" +
                "Period: 1\n" +
                "State: Gas\n" +
                "Melting phase: -259.198 °C\n" +
                "Boiling phase: -252.762 °C", actual);
    }

    @Test
    void shouldFormatInfoWithNoAlias()
    {
        // given
        Element element = new Element("Helium", "", "He", 2, NOBLE_GAS, 18, 1, GAS, -272.20, -268.928);

        // when
        String actual = new ElementInfoFormatter().formatInfo(element);

        // then
        assertEquals("Name: Helium\n" +
                "Alias: -\n" +
                "Symbol: He\n" +
                "Atomic number: 2\n" +
                "Metallic property: Noble gas\n" +
                "Group: 18\n" +
                "Period: 1\n" +
                "State: Gas\n" +
                "Melting phase: -272.2 °C\n" +
                "Boiling phase: -268.928 °C", actual);
    }
}