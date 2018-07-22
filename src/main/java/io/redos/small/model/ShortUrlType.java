package io.redos.small.model;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/7/12 12:20
 * @copyright ©2018
 */
public enum ShortUrlType {

    SHEAR_PLATE(0,"文本复制"),URL_FORWORD(1,"链接转发");

    private int value;
    private String name;

    ShortUrlType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static ShortUrlType getSUT(int id) {
        switch(id) {
            case 0 :
                return SHEAR_PLATE;
            case 1 :
                return URL_FORWORD;
            default:
                return null;
        }
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
