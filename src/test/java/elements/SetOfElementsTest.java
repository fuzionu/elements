package elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetOfElementsTest
{
    @Test
    void shouldGetElementByName()
    {
        // given
        String elementName = "hel";

        // when
        Element element = new SetOfElements().getElement(elementName);

        // then
        assertEquals("Hel", element.name);
    }

    @Test
    void shouldGetElementByAlias()
    {
        // given
        String elementAlias = "hydrogenium";

        // when
        Element element = new SetOfElements().getElement(elementAlias);

        // then
        assertEquals("Hydrogenium", element.latinAlias);
    }

    @Test
    void shouldGetElementBySymbol()
    {
        // given
        String elementSymbol = "h";

        // when
        Element element = new SetOfElements().getElement(elementSymbol);

        // then
        assertEquals("H", element.symbol);
    }

    @Test
    void shouldThrowElementNotFoundException()
    {
        // given
        String elementName = "abc";

        // then
        assertThrows(ElementNotFoundException.class, () -> new SetOfElements().getElement(elementName));
    }

    @Test
    void shouldIgnoreCase()
    {
        // given
        String elementAlias = "HeLiUm";

        // when
        Element element = new SetOfElements().getElement(elementAlias);

        // then
        assertEquals("Hel", element.name);
    }

    @Test
    void shouldTrimWhitespace()
    {
        // given
        String elementName = " wodór  ";

        // when
        Element element = new SetOfElements().getElement(elementName);

        // then
        assertEquals("Wodór", element.name);
    }
}