package com.example.kotlin.kotlin.basic

/**
 * object 单例
 * @author zhangquan
 */
object SingleCls {
    //public static final String TAG = "StaticCls";
    const val TAG = "StaticCls" //final静态变量

    // public static boolean staticField;
    @JvmField
    var staticField = true

    @JvmStatic
    fun staticMethod1(str: String?) {

    }
    /**
    public final class StaticCls {
        @NotNull
        public static final String TAG = "StaticCls";

        @JvmField
        public static boolean staticField;

        public static final StaticCls INSTANCE;

        @JvmStatic
        public static final void staticMethod1(@Nullable String str) {
        }

        private StaticCls() {
        }

        static {
            StaticCls var0 = new StaticCls();
            INSTANCE = var0;
            staticField = true;
        }
    }
      */
}
