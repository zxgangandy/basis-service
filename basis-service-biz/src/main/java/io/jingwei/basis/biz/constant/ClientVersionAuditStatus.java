package io.jingwei.basis.biz.constant;

public enum ClientVersionAuditStatus {

    WAITING("WAITING"),
    APPROVED("APPROVED"),
    FAILED("FAILED");

    private String status;


    ClientVersionAuditStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
