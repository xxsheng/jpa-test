/*
 * Alipay.com Inc.
 * Copyright (c) 2004_2007 All Rights Reserved.
 */
package jpa.test.model.enums.user;

/**
 * @description: 栏目层级
 * @author: liuzhong
 * @date: 2021_04_06 21:28
 */
public enum ColumnModeEnum {
    // 仅本栏目 self
    // 包含所有子栏目 all_sub_column
    // 包含下一级子栏目 next_level_sub_column
    // 包含下二级子栏目 next_two_sub_column
    /**
     * 仅本栏目
     */
    SELF("仅本栏目", "SELF"),
    /**
     * 包含所有子栏目
     */
    ALL_SUB_COLUMN("包含所有子栏目", "ALL_SUB_COLUMN"),
    /**
     * 包含下一级子栏目
     */
    NEXT_LEVEL_SUB_COLUMN("包含下一级子栏目", "NEXT_LEVEL_SUB_COLUMN"),

    /**
     * 包含下俩级子栏目
     */
    NEXT_TWO_SUB_COLUMN("包含下俩级子栏目", "NEXT_TWO_SUB_COLUMN");

    private String desc;

    private String code;

    /**
     * @param desc
     * @param code
     */
    private ColumnModeEnum(String desc, String code) {
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
    public static ColumnModeEnum getByCode(String code) {
        for (ColumnModeEnum accountStatus : values()) {
            if (accountStatus.getCode().equals(code)) {
                return accountStatus;
            }
        }
        return null;
    }

}