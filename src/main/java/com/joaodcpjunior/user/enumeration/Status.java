package com.joaodcpjunior.user.enumeration;

public enum Status {
    USER_ADMIN("USER_ADMIN"),
    USER_NORMAL("USER_NORMAL");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
