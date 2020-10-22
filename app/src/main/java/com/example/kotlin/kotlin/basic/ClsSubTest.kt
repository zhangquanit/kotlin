package com.example.kotlin.kotlin.basic

/**
 * @author zhangquan
 */
class ClsSubTest(str: String?) : ClsTest(str) { //声明主构造函数

    constructor(str: String?, time: Long) : this(str) { //次构造函数  需要代理主构造函数

    }

    //
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