package com.servico;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MensagemServico {
    @WebMethod(operationName="getMensagem")
    public String getMensagem();
    @WebMethod(operationName="setMensagem")
    public void setMensagem(@WebParam(name="mensagem")
    String mensagem);
}