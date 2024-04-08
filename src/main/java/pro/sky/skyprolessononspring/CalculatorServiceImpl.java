package pro.sky.skyprolessononspring;

import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements CalculatorSreviceInterface {

    public String hello(){
        return "<h1>Добро пожаловать в калькулятор</h>" +
                "<h2>Информация:</h2>" +
                " <p>/calculator/plus?num1=введите свое число&num2=введите свое число - должен сложить num1 и num2</p>" +
                " <p>/calculator/minus?num1=введите свое число&num2=введите свое число - должен вычесть из num1 num2</p>" +
                " <p>/calculator/multiply?num1=введите свое число&num2=введите свое число - должен умножить num1 на num2" +
                " <p>/calculator/divide?num1=введите свое число&num2=введите свое число - должен разделить num1 на num2 (деление на ноль запрещено)";
    }
    public String plus(int num1, int num2){
        return num1 + " + " + num2 + " = " + (num1 + num2);


    }
    public String minus(int num1, int num2){
        return num1 + " - " + num2 + " = " + (num1 - num2);

    }
    public String multiply(int num1, int num2){
        return num1 + " * " + num2 + " = " + (num1 * num2);

    }
    public String divide(double num1, double num2){
        if(num2 == 0){
            return "На ноль делить нельзя";
        }else{
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }

    }


}
