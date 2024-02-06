

import javax.validation.constraints.NotNull;
import java.util.Objects;

package com.itau.dto
public class SimulacaoDTO {

    private String contrato;
    private Double valorTotalDevido;
    private Double valorParcela;
    private Integer quantidadeParcela;

    SimulacaoDTO(String contrato, Double valorTotalDevido, Double valorParcela, Integer )quantidadeParcela{
        this.contrato = contrato;
        this.valorParcela = valorParcela;
        this.quantidadeParcela = quantidadeParcela;
        this.valorTotalDevido = valorTotalDevido;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public Double getValorTotalDevido() {
        return valorTotalDevido;
    }

    public void setValorTotalDevido(Double valorTotalDevido) {
        this.valorTotalDevido = valorTotalDevido;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public Integer getQuantidadeParcela() {
        return quantidadeParcela;
    }

    public void setQuantidadeParcela(Integer quantidadeParcela) {
        this.quantidadeParcela = quantidadeParcela;
    }
}