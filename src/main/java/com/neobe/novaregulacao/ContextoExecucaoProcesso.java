package com.neobe.novaregulacao;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "ContextoExecucaoProcesso")
public class ContextoExecucaoProcesso implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CONTEXTOEXECUCAOPROCESSO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "CONTEXTOEXECUCAOPROCESSO_ID_SEQ", name = "CONTEXTOEXECUCAOPROCESSO_ID_GENERATOR")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Guia de solicitação")
	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private com.neobe.novaregulacao.GuiaSolicitacao guiaSolicitacao;

	public ContextoExecucaoProcesso() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public com.neobe.novaregulacao.GuiaSolicitacao getGuiaSolicitacao() {
		return this.guiaSolicitacao;
	}

	public void setGuiaSolicitacao(
			com.neobe.novaregulacao.GuiaSolicitacao guiaSolicitacao) {
		this.guiaSolicitacao = guiaSolicitacao;
	}

	public ContextoExecucaoProcesso(java.lang.Long id,
			com.neobe.novaregulacao.GuiaSolicitacao guiaSolicitacao) {
		this.id = id;
		this.guiaSolicitacao = guiaSolicitacao;
	}

}