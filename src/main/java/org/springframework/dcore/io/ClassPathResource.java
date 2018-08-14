package org.springframework.dcore.io;

import java.io.InputStream;

/**
 * @author xh.d
 * @since 2018/8/14 10:41
 */
public class ClassPathResource implements Resource {
    private String path;
    private ClassLoader classLoader;

    public ClassPathResource(String path, ClassLoader classLoader) {
        String pathToUse = path;
        if (pathToUse.startsWith("/")) {
            pathToUse = pathToUse.substring(1);
        }
        this.path = pathToUse;
        this.classLoader = classLoader;
    }

    @Override
    public InputStream getInputStream() {
        if (path==null||path.length()==0){
            return null;
        }
        if (classLoader!=null){
            return classLoader.getResourceAsStream(path);
        }else {
            return ClassLoader.getSystemResourceAsStream(path);
        }
    }
}
