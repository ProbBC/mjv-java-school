package agualuznotification.app;

import agualuznotification.enums.TipoServico;
import agualuznotification.model.Cadastro;
import agualuznotification.model.Contrato;
import agualuznotification.model.Endereco;
import agualuznotification.service.GeradorMensagem;

import java.time.LocalDateTime;

public class SistemaAguaLuzNotification {
    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        Cadastro gleyson = new Cadastro();
        Endereco endereco = new Endereco();

        contrato.setCliente(gleyson);
        contrato.setNumeroProtocolo(2022025687L);
        contrato.setDataHora(LocalDateTime.of(2022, 02, 21, 16, 00));
        contrato.setTipoServico(TipoServico.AGUA);
        contrato.setValor(127.33);

        endereco.setLogradouro("Rua das Marias");
        endereco.setNumero("243");
        endereco.setComplemento("Ap 207, Bloco C");
        endereco.setBairro("Santo Antonio");
        endereco.setCidade("São Paulo / SP");
        endereco.setCep("27.310-657");

        gleyson.setNome("Gleyson Sampaio");
        gleyson.setCpf("23476598727");
        gleyson.setEndereco(endereco);
        gleyson.setContrato(contrato);

        GeradorMensagem gm = new GeradorMensagem();
        gm.gerar(contrato);
    }
}
