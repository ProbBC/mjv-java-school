package agualuznotification.model;

import agualuznotification.enums.TipoServico;

import java.time.LocalDateTime;

public class Contrato {
    private Long numeroProtocolo;
    private Double valor;
    private Cadastro cliente;
    private LocalDateTime dataHora;

    private TipoServico tipoServico;


    public Long getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(Long numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cadastro getCliente() {
        return cliente;
    }

    public void setCliente(Cadastro cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }
}
