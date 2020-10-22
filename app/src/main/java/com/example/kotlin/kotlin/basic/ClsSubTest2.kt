package com.example.kotlin.kotlin.basic

/**
 * @author zhangquan
 */
class ClsSubTest2 : ClsTest { //无主构造函数

    constructor(str: String?) : super(str)
    constructor(
        str: String?,
        time: Long
    ) : super(str) {

    }

    fun method1() {
        name = "JACK"
    }
    /**
    public final class ClsSubTest extends ClsTest {
    public final void method1() {
    this.setName("JACK");
    }

    public ClsSubTest(@Nullable String str) {
    super(str);
    }

    public ClsSubTest(@Nullable String str, long time) {
    this(str);
    }
    }
     */
}