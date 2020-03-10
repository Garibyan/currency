package com.wsdlparser.currency;

import com.wsdlparser.NBGCurrencyBindingStub;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.util.List;

@Service
public class MainService {

    private NBGCurrencyBindingStub nbgCurrencyBindingStub;

    public MainService(NBGCurrencyBindingStub nbgCurrencyBindingStub) throws RemoteException {
        this.nbgCurrencyBindingStub = nbgCurrencyBindingStub;
    }

    public List<String> getNbgCurrencyBindingStub1() throws RemoteException {
        List<String> currenciesList = null;
        System.out.println(nbgCurrencyBindingStub.getCurrency("usd"));
        System.out.println(nbgCurrencyBindingStub.getCurrency("eur"));

        currenciesList.add(nbgCurrencyBindingStub.getCurrency("usd"));
        currenciesList.add(nbgCurrencyBindingStub.getCurrency("eur"));

        return currenciesList;
    }

    Path

}
