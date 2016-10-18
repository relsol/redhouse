package com.redhouse.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by RelSol.Chen on 2016/9/9.
 */
public class JsonUtil {

    public static String obj2Json(Object obj) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(dateFormat);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        return mapper.writeValueAsString(obj);
    }

    public static <T> T str2Obj(String json, Class<T> clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(dateFormat);
        return mapper.readValue(json, clazz);
    }

    public static <T> T str2List(String json,  Class<?> collectionClass, Class<?>... elementClasses) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(dateFormat);

        JavaType javaType = mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
        return mapper.readValue(json, javaType);
    }
}
