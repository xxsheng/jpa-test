/*
 * Alipay.com Inc.
 * Copyright (c) 2004-2007 All Rights Reserved.
 */
package jpa.test.model.enums;

/**
 * @description: 模板类型
 * @author: lily
 * @date: 2021-03-25 12:02
 */
public enum ColumnTypeEnum {
    /**
     * 栏目模板
     */
    COLUMN("栏目模板", "COLUMN"),

    /**
     * 内容模板
     */
    CONTENT("内容模板", "CONTENT");

    private String desc;

    private String code;

    /**
     * @param desc
     * @param code
     */
    private ColumnTypeEnum(String desc, String code) {
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
    public static ColumnTypeEnum getByCode(String code) {
        for (ColumnTypeEnum accountStatus : values()) {
            if (accountStatus.getCode().equals(code)) {
                return accountStatus;
            }
        }
        return null;
    }

}