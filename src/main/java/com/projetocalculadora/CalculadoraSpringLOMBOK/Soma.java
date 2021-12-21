package com.projetocalculadora.CalculadoraSpringLOMBOK;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/calc")
@Data
public class Soma {

    private Integer numero1 = 45;
    private Integer numero2 = 14;
    private Integer soma = numero1 + numero2;

    @GetMapping
    public Integer calc() {
        return getSoma();
    }



}
