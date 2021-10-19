package StepDefinition;

import company.LibraryArtifact;
import company.Paperback;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

class IsItHarryPotter{
    static String isItHarryPotter(String name){
        return "Harry Potter".equals(name) ? "Yes": "No";
    }
}
public class MyStepdefs {

        Paperback book = new Paperback("Harry Potter","Ben","7829");

        private String expected;
        private String actual;


        @Given("Book is harry potter")
        public void book_is_harry_potter(){
            expected="Harry Potter";
    }

    @When("I ask if it is harry potter")
    public void i_ask_if_it_is_harry_potter(){
            actual=book.getName();
    }

    @Then("The answer should be {string}")
    public void the_answer_should_be(String name){
            assertEquals(expected,actual);
    }
    }