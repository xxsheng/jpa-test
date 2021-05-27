/*
 * Alipay.com Inc.
 * Copyright (c) 2004-2007 All Rights Reserved.
 */
package jpa.test.model.enums;

/**
 *
 * @author yangran
 * @version $id: AccountStatus.java, v 0.1 2019��1��23�� ����10:38:43 yangran Exp $
 */
public enum UserStatusEnum {
    /**
     * 正常
     */
    ENABLE("正常", "T"),
    /**
     * 冻结
     */
    FROZEN("冻结", "F"),
    /**
     * 无效
     */
    INVALID("无效", "I");

    private String desc;

    private String code;

    /**
     * @param desc
     * @param code
     */
    private UserStatusEnum(String desc, String code) {
        this.desc = desc;
        this.code = code;
    }

    /**
     * @return Returns the desc.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @return Returns the code.
     */
    public String getCode() {
        return code;
    }

    /**
     */
    public static UserStatusEnum getByCode(String code) {
        for (UserStatusEnum accountStatus : values()) {
            if (accountStatus.getCode().equals(code)) {
                return accountStatus;
            }
        }
        return null;
    }

}