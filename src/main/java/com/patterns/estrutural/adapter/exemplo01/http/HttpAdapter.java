package com.patterns.estrutural.adapter.exemplo01.http;

import java.util.Map;

public interface HttpAdapter
{
    void post(String url, Map<String, Object> dados);

}
