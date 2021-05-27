/*
 * Alipay.com Inc.
 * Copyright (c) 2004-2007 All Rights Reserved.
 */
package jpa.test.model.enums;

/**
 * @description: 标签应用级别
 * @author: liuzhong
 * @date: 2021-04-06 21:28
 */
public enum TagLevelEnum {
    /**
     * 内置
     */
    INTEGRAL("内置", "integral"),
    /**
     * 用户自定义
     */
    DEFINED("用户自定义", "defined");

    private String desc;

    private String code;

    /**
     * @param desc
     * @param code
     */
    private TagLevelEnum(String desc, String code) {
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
    public static TagLevelEnum getByCode(String code) {
        for (TagLevelEnum accountStatus : values()) {
            if (accountStatus.getCode().equals(code)) {
                return accountStatus;
            }
        }
        return null;
    }

}