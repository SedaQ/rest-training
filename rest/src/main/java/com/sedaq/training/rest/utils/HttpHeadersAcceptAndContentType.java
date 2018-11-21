package com.sedaq.training.rest.utils;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 * @author Pavel Šeda
 */
public class HttpHeadersAcceptAndContentType {

    private HttpHeadersAcceptAndContentType() {
    }

    public static boolean isJson(HttpHeaders headers) {
        List<MediaType> mediaTypes = headers.getAccept();
        for (MediaType mt : mediaTypes) {
            if (mt.getType() != null && mt.getType().equals(MediaType.APPLICATION_JSON_VALUE)) {
                return true;
            }
        }
        MediaType mt = headers.getContentType();
        return mt != null && mt.getType().equals(MediaType.APPLICATION_JSON_VALUE) ? true : false;
    }

    public static boolean isXML(HttpHeaders headers) {
        List<MediaType> mediaTypes = headers.getAccept();
        for (MediaType mt : mediaTypes) {
            if (mt.getType() != null && mt.getType().equals(MediaType.APPLICATION_ATOM_XML_VALUE)) {
                return true;
            }
        }
        MediaType mt = headers.getContentType();
        return mt != null && mt.getType().equals(MediaType.APPLICATION_ATOM_XML_VALUE) ? true : false;
    }

}
