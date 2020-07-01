package elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementsRepositoryTest
{
    @Test
    void shouldGetElementByName()
    {
        // given
        String elementName = "hydrogen";

        // when
        Element element = new ElementsRepository().find(elementName);

        // then
        assertEquals("Hydrogen", element.name);
    }

    @Test
    void shouldGetElementByAlias()
    {
        // given
        String elementAlias = "hydrogenium";

        // when
        Element element = new ElementsRepository().find(elementAlias);

        // then
        assertEquals("Hydrogenium", element.alias);
    }

    @Test
    void shouldGetElementBySymbol()
    {
        // given
        String elementSymbol = "h";

        // when
        Element element = new ElementsRepository().find(elementSymbol);

        // then
        assertEquals("H", element.symbol);
    }

    @Test
    void shouldThrowElementNotFoundException()
    {
        // given
        String elementName = "abc";

        // then
        assertThrows(ElementNotFoundException.class, () -> new ElementsRepository().find(elementName));
    }

    @Test
    void shouldIgnoreCase()
    {
        // given
        String elementAlias = "HeLiUm";

        // when
        Element element = new ElementsRepository().find(elementAlias);

        // then
        assertEquals("Helium", element.name);
    }

    @Test
    void shouldTrimWhitespace()
    {
        // given
        String elementName = " lithium  ";

        // when
        Element element = new ElementsRepository().find(elementName);

        // then
        assertEquals("Lithium", element.name);
    }
}