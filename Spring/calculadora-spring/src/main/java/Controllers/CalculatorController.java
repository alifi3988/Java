package Controllers;

import org.springframework.web.bind.annotation.*;

@RestController //isso fazerá a identificação do controller
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping
    public String mainPage(){
        return "Welcome to application of Calculator.!";
    }

    //na web para inserir o valor, teria que colocr  /calculator/sum/[valor]/[valor]
    @GetMapping("/sum1")
    public String sumValor(
            @PathVariable int a,
            @PathVariable int b)
    {
        return "Sum is: " + (a + b);
    }

    //na web para inserir o valor, teria que colocr /calculator/sum?a=[valor]&b=[valor]
    @GetMapping("/sum2")
    public String sumValorI(
            @RequestParam(name="a") int a,
            @RequestParam(name="b") int b)
    {
        return "Sum is: " + (a + b);
    }
}
