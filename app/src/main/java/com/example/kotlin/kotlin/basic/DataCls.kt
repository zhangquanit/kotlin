package com.example.kotlin.kotlin.basic

/**
 * 一般用于Model，自动生成set和get
 * @author zhangquan
 */
data class DataCls(var str: String?, var time: Long?) {
    var other: String? = null //其他属性
    fun getStr2(): String {
        str = "abc"
        return str + "aa"
    }
    /**
    public final class DataCls {
    private String str;
    private Long time;

    public DataCls(@Nullable String str, @Nullable Long time) {
    this.str = str;
    this.time = time;
    }
    public final String getStr2() {
    this.str = "abc";
    return str + "aa"
    }

    public final String getStr() {
    return this.str;
    }

    public final void setStr( String var1) {
    this.str = var1;
    }

    public final Long getTime() {
    return this.time;
    }

    public final void setTime(@Nullable Long var1) {
    this.time = var1;
    }

     */
}