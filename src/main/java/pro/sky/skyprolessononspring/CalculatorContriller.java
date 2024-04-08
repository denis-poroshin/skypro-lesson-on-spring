package pro.sky.skyprolessononspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorContriller {
    private final CalculatorSreviceInterface calculatorSreviceInterface;

    public CalculatorContriller(CalculatorSreviceInterface calculatorSreviceInterface) {
        this.calculatorSreviceInterface = calculatorSreviceInterface;
    }
    @GetMapping(path = "/calculator")
    public String hello(){
        return calculatorSreviceInterface.hello(); // почему мы в конструктор передаем интерфейс, хотя можно передавать данные с сервиса (СalculatorServiceImpl)?
    }


    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorSreviceInterface.plus(num1,num2);

    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorSreviceInterface.minus(num1,num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorSreviceInterface.multiply(num1,num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") double num1, @RequestParam("num2") double num2){
        return calculatorSreviceInterface.divide(num1,num2);
    }






}
