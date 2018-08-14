package org.springframework.dcore.utils;

/**
 * @author xh.d
 * @since 2018/8/14 10:27
 */
public abstract class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader c1 = null;
        if (c1==null){
            try {
                c1 = Thread.currentThread().getContextClassLoader();
            }catch (Exception ex1){
                //ignore 1
            }
            if (c1==null){
                try {
                    c1 = ClassUtils.class.getClassLoader();
                }catch (Exception ex2){
                    //ignore 2
                }
                if (c1==null){
                    try {
                        c1 = ClassLoader.getSystemClassLoader();
                    }catch (Exception ex3){
                        //ignore 3
                    }
                }
            }
        }
        return c1;
    }
}
