package StepDefinition;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

    public class StepDefinition {
        int sum;
        int numOne;
        int numTwo;

        @Дано("^первое число (\\d+)$")
        public void firstNumber(int numOne){
            this.numOne = numOne;
        }

        @Дано("^второе число (\\d+)$")
        public void secondNumber(int numTwo){
            this.numTwo = numTwo;
        }

        @Если("^первое число прибавить к второму числу$")
        public void Plus(){
            sum = numOne + numTwo;
        }

        @То("^получим сумму$")
        public void givenSum(){
            Assert.assertEquals(sum, (numOne + numTwo));
            System.out.println(sum);
        }
}
