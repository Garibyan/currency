package com.wsdlparser.currency;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.RemoteException;
import java.util.List;

@RestController
public class MainController {

    private final MainService mainService;


    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/currencies")
    public List<String> getUsdEurCurrencies() throws RemoteException {
        return mainService.getNbgCurrencyBindingStub1();
    }
}
