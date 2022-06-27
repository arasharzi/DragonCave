import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class MainTest {

    @BeforeEach
    void setUp()
    {
    }

    @Test
    void getCave()
    {
        String cave1 = "\nYou approach the cave... \n"
                + "It is dark and spooky... \n"
                + "A large dragon jumps out in front of you! He opens his jaws and... \n"
                + "Gobbles you down in one bite!";

        String cave2 = "\nFriendly dragon...";
        String invalid = "invalid";


        assertEquals(cave1, Main.getCave("1"));
        assertEquals(cave2, Main.getCave("2"));
        assertEquals(invalid, Main.getCave("3"));
        assertEquals(invalid, Main.getCave("a"));
    }

    @AfterEach
    void tearDown()
    {
    }


}