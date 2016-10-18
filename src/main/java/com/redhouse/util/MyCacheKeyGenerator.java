package com.redhouse.util;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.util.DigestUtils;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created by RelSol.Chen on 2016/9/12.
 */
public class MyCacheKeyGenerator implements KeyGenerator {

    @Override
    public Object generate(Object o, Method method, Object... objects) {
        StringBuilder builder = new StringBuilder();
        builder.append(method.toGenericString()).append("\r\n");
        try {
            builder.append(JsonUtil.obj2Json(objects));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return DigestUtils.md5DigestAsHex(builder.toString().getBytes());
    }
}
