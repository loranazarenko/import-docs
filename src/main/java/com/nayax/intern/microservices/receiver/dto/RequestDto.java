package com.nayax.intern.microservices.receiver.dto;

public class RequestDto {

    private Integer customerId;
    private String type;
    private byte[] document;
    private long documentId;
    private String documentType;

    public RequestDto(Integer customerId, String type, byte[] document, String documentType) {

        this.customerId = customerId;
        this.type = type;
        this.document = document;
        this.documentType = documentType;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }
}


