import javax.security.auth.callback.PasswordCallback;

public class Principal {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(150);

        //---------------- X ---------------
        new ImpostoBuild()
                .criarImposto()
                .comOrcamento(orcamento)
                .doTipoX().aplicar();

        orcamento.setValor(80);
        new ImpostoBuild()
                .criarImposto()
                .comOrcamento(orcamento)
                .doTipoX().aplicar();

        //---------------- Y ---------------
        orcamento.setValor(150);
        new ImpostoBuild()
                .criarImposto()
                .comOrcamento(orcamento)
                .doTipoY().aplicar();

        orcamento.setValor(30);
        new ImpostoBuild()
                .criarImposto()
                .comOrcamento(orcamento)
                .doTipoY().aplicar();

        //---------------- Z ---------------
        orcamento.setValor(150);
        new ImpostoBuild()
                .criarImposto()
                .comOrcamento(orcamento)
                .comXDiasParaPagamento(10)
                .doTipoZ().aplicar();

        orcamento.setValor(30);
        new ImpostoBuild()
                .criarImposto()
                .comOrcamento(orcamento)
                .comXDiasParaPagamento(10)
                .doTipoZ().aplicar();

    }
}