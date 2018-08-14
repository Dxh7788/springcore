package org.springframework.dcore.io;

import org.springframework.dcore.utils.ClassUtils;

/**
 * @author xh.d
 * @since 2018/8/14 10:25
 */
public class DefaultResourceLoader implements ResourceLoader {
    private ClassLoader classLoader;

    public DefaultResourceLoader() {
        this.classLoader = ClassUtils.getDefaultClassLoader();
    }

    public DefaultResourceLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public Resource getResource(String location) {
        return new ClassPathResource(location,getClassLoader());
    }

    @Override
    public ClassLoader getClassLoader() {
        return (this.classLoader!=null?this.classLoader:ClassUtils.getDefaultClassLoader());
    }
}
