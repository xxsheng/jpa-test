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
public enum TemplateTypeEnum {
    /**
     * 综合页
     */
    MUL("综合", "MUL"),
    /**
     * 栏目列表页
     */
    COLUMN("栏目", "COLUMN"),
    /**
     * 页面内容
     */
    PAGE("内容", "PAGE"),
    /**
     * 专题
     */
    SPEC("专题", "SPEC");

    private String desc;

    private String code;

    /**
     * @param desc
     * @param code
     */
    private TemplateTypeEnum(String desc, String code) {
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
    public static TemplateTypeEnum getByCode(String code) {
        for (TemplateTypeEnum accountStatus : values()) {
            if (accountStatus.getCode().equals(code)) {
                return accountStatus;
            }
        }
        return null;
    }

}