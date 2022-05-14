package com.easy2go.urlShorten.service.impl;

import com.easy2go.urlShorten.service.IApiService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author DongerKai
 * @since 2022/5/14 14:53 ，1.0
 **/
@Service
@RequiredArgsConstructor
public class ApiService implements IApiService {
    @Override
    public String generate(String urlLong) {
        String hex = DigestUtils.md5Hex(urlLong);
        String base = new String(Base64.encodeBase64(hex.getBytes()));
        return "http://localhost:4399/url-shorten/"+base.substring(0,6);
    }
}
