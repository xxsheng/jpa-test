/*
 * Alipay.com Inc.
 * Copyright (c) 2004-2007 All Rights Reserved.
 */
package jpa.test.model.enums;

/**
 * @description: 标签内置应用级别
 * @author: liuzhong
 * @date: 2021-04-06 21:28
 */
public enum TagIntegralLevelEnum {
    TOP_1("置顶1", "TOP_1"),
    TOP_2("置顶2", "TOP_2"),
    TOP_3("置顶3", "TOP_3");

    private String desc;

    private String code;

    /**
     * @param desc
     * @param code
     */
    private TagIntegralLevelEnum(String desc, String code) {
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
    public static TagIntegralLevelEnum getByCode(String code) {
        for (TagIntegralLevelEnum accountStatus : values()) {
            if (accountStatus.getCode().equals(code)) {
                return accountStatus;
            }
        }
        return null;
    }

}