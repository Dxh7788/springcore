package org.springframework.dcore.io;

/**
 * @author xh.d
 * @since 2018/8/14 10:14
 */
public interface ResourceLoader {

    Resource getResource(String location);
    ClassLoader getClassLoader();
}
