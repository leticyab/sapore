package br.com.sapore.VO;

public class PedidoVO {
private Integer id;
private String mesa;
private String tamanho;
private String borda;
private String saborUm;
private String saborDois;
private String saborTres;
private String obs;
private String observacao;


public PedidoVO() {
	
}





public PedidoVO(Integer id, String mesa) {
	super();
	this.id = id;
	this.mesa = mesa;
}





public PedidoVO(Integer id, String mesa, String tamanho, String borda,
		String saborUm, String saborDois, String saborTres, String obs,
		String observacao) {
	super();
	this.id = id;
	this.mesa = mesa;
	this.tamanho = tamanho;
	this.borda = borda;
	this.saborUm = saborUm;
	this.saborDois = saborDois;
	this.saborTres = saborTres;
	this.obs = obs;
	this.observacao = observacao;
}





public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getMesa() {
	return mesa;
}


public void setMesa(String mesa) {
	this.mesa = mesa;
}


public String getTamanho() {
	return tamanho;
}


public void setTamanho(String tamanho) {
	this.tamanho = tamanho;
}


public String getBorda() {
	return borda;
}


public void setBorda(String borda) {
	this.borda = borda;
}


public String getSaborUm() {
	return saborUm;
}


public void setSaborUm(String saborUm) {
	this.saborUm = saborUm;
}


public String getSaborDois() {
	return saborDois;
}


public void setSaborDois(String saborDois) {
	this.saborDois = saborDois;
}


public String getSaborTres() {
	return saborTres;
}


public void setSaborTres(String saborTres) {
	this.saborTres = saborTres;
}


public String getObs() {
	return obs;
}


public void setObs(String obs) {
	this.obs = obs;
}


public String getObservacao() {
	return observacao;
}


public void setObservacao(String observacao) {
	this.observacao = observacao;
}




	
}
