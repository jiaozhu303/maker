//package com.lenovo.maker.web.HttpMessageConverter;
//
//import org.springframework.http.HttpInputMessage;
//import org.springframework.http.HttpOutputMessage;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.HttpMessageNotReadableException;
//import org.springframework.http.converter.HttpMessageNotWritableException;
//
//import java.io.IOException;
//import java.util.List;
//
///**
// * Created by zhaodongjie on 2017/4/16.
// */
//public class MakerCoverters implements HttpMessageConverter {
//    @Override
//    public boolean canRead(Class aClass, MediaType mediaType) {
//        System.out.println("canRead ... ");
//        return false;
//    }
//
//    @Override
//    public boolean canWrite(Class aClass, MediaType mediaType) {
//        System.out.println("canWrite ... ");
//        return false;
//    }
//
//    @Override
//    public List<MediaType> getSupportedMediaTypes() {
//        System.out.println("getSupportedMediaTypes ... ");
//        return null;
//    }
//
//    @Override
//    public Object read(Class aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
//        System.out.println("read ... ");
//        return null;
//    }
//
//    @Override
//    public void write(Object o, MediaType mediaType, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
//        System.out.println("write ... ");
//    }
//}
