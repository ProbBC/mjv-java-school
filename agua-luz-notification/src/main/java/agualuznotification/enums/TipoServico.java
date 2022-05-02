package agualuznotification.enums;

public enum TipoServico {
    AGUA ("Água"),
    LUZ ("Luz");

    private TipoServico (String siglaTipoServico){
        this.siglaTipoServico = siglaTipoServico;
    }
    private String siglaTipoServico;

    public String getSiglaTipoServico() {
        return siglaTipoServico;
    }

    public void setSiglaTipoServico(String siglaTipoServico) {
        this.siglaTipoServico = siglaTipoServico;
    }
}
