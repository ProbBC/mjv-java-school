package agualuznotification.service;

import agualuznotification.model.Cadastro;
import agualuznotification.model.Contrato;
import agualuznotification.model.Endereco;
import agualuznotification.util.FormatadorUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeradorMensagem {
    public void gerar(Contrato contrato) {
        StringBuilder sb = new StringBuilder();
        Cadastro cliente = contrato.getCliente();
        Endereco endereco = cliente.getEndereco();

        String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
        String formatarData = FormatadorUtil.formatarData(contrato.getDataHora());

        sb.append(String.format("Senhor(a) %s cpf de número %s, ", cliente.getNome(), cpfFormatado));
        sb.append(String.format("Informamos que conforme contrato com protocolo de número %d" +
                        " está agendado para a data/hora %sh a instalação do serviço de %s com taxa de valor " +
                        "R$%.2f em sua residência localizada no endereço abaixo: \n" +
                        "    Logradouro: %s, %s\n" +
                        "    Complemento: %s\n" +
                        "    Bairro: %s\n" +
                        "    Cidade: %s\n" +
                        "    Cep: %s\n",
                contrato.getNumeroProtocolo(), formatarData, contrato.getTipoServico().getSiglaTipoServico(), contrato.getValor(),
                endereco.getLogradouro(), endereco.getNumero(), endereco.getComplemento(), endereco.getBairro(), endereco.getCidade(), endereco.getCep()));
        System.out.println(sb);

    }

}
