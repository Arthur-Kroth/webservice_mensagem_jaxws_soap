package com.servico;

import javax.jws.WebService;

@WebService(endpointInterface = "com.servico.MensagemServico")
public class MensagemServicoImpl implements MensagemServico {
    private String mensagem;
    @Override
    public String getMensagem() {
        System.out.println("Executando serviço getMensagem.");
        return "Mensagem: " + mensagem;
    }
    @Override
    public void setMensagem(String mensagem) {
        System.out.println("Executando serviço setMensagem(string).");
        this.mensagem = mensagem;
    }
}