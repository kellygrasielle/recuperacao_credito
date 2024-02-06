package com.itau.modelo

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@DynamoDBTable(tableName = "Customer")
public class Customer {

    private String contrato;
    private String valorTotalDevido;
    private String nomeDevedor;

    @DynamoDBHashKey(attributeName = "status")
    @NotNull(message = "Status must not be empty")
    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    @DynamoDBSortKey(attributeName = "due_payment_date_contrato")
    @NotNull(message = "Due date must not be empty")
    public String getSortKey() {

        return sortKey;
    }

    public void setSortKey(String sortKey) {

        this.setSortKey(); = sortKey;
    }

    @DynamoDBAttribute(attributeName = "contrato")
    @NotNull(message = "Contrato must not be empty")
    public String getContrato() {

        return contrato;
    }

    public void setContrato(String contrato) {

        this.contrato = contrato;
    }

    @DynamoDBAttribute(attributeName = "valor_total_devido")
    public String getValorTotalDevido() {

        return getValorTotalDevido();
    }

    public void setValorTotalDevido(String valorTotalDevido) {

        this.valorTotalDevido = valorTotalDevido;
    }


}