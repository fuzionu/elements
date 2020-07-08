package elements;

import org.junit.jupiter.api.Test;

class TextInterfaceTest extends StandardInputTest
{
    @Test
    void shouldShowStartingInfoAndExit()
    {
        // given
        input("exit");

        // when
        new TextInterface().start();

        // then
        assertPrinted("Chemical elements.\nType \"element\" to find one\n" +
                        "or type \"exit\" to terminate application.",
                "Closing...");
    }

    @Test
    void shouldContinueWithEmptyInput()
    {
        // given
        input("", "  ", "   ", "exit");

        // when
        new TextInterface().start();

        // then
        assertPrinted("Chemical elements.\nType \"element\" to find one\n" +
                        "or type \"exit\" to terminate application.",
                "",
                "",
                "",
                "Closing...");
    }

    @Test
    void shouldNotAllowInvalidCommand()
    {
        // given
        input("asd", "qwe", "exit");

        // when
        new TextInterface().start();

        // then
        assertPrinted("Chemical elements.\nType \"element\" to find one\n" +
                        "or type \"exit\" to terminate application.",
                "Invalid command. Type again",
                "Invalid command. Type again",
                "Closing...");
    }

    @Test
    void shouldReturnAfterTypingElement()
    {
        // given
        input("element", "ret", "exit");

        // when
        new TextInterface().start();

        // then
        assertPrinted("Chemical elements.\nType \"element\" to find one\n" +
                        "or type \"exit\" to terminate application.",
                "Type element's name, alias or symbol or type \"ret\" to go back.",
                "> ",
                "Chemical elements.\nType \"element\" to find one\n" +
                        "or type \"exit\" to terminate application.",
                "Closing...");
    }

    @Test
    void shouldTrimInputAndShowInfo()
    {
        // given
        input("element", "  carbon ", "exit");

        // when
        new TextInterface().start();

        // then
        assertPrinted("Chemical elements.\nType \"element\" to find one\n" +
                        "or type \"exit\" to terminate application.",
                "Type element's name, alias or symbol or type \"ret\" to go back.",
                "> ",
                "Name: Carbon\n" +
                        "Alias: Carboneum\n" +
                        "Symbol: C\n" +
                        "Atomic number: 6\n" +
                        "Metallic property: Non metal\n" +
                        "Group: 14\n" +
                        "Period: 2\n" +
                        "State: Solid\n" +
                        "Melting phase: 4400 °C\n" +
                        "Boiling phase: 3852 °C",
                "Type another element or \"exit\" to close.",
                "Closing...");
    }

    @Test
    void shouldNotAllowInvalidElement()
    {
        // given
        input("element", "zxc", "jkl", "ret", "exit");

        // when
        new TextInterface().start();

        // then
        assertPrinted("Chemical elements.\nType \"element\" to find one\n" +
                        "or type \"exit\" to terminate application.",
                "Type element's name, alias or symbol or type \"ret\" to go back.",
                "> Element not found. Type again.",
                "> ",
                "Chemical elements.\nType \"element\" to find one\n" +
                        "or type \"exit\" to terminate application.",
                "Closing...");
    }
}