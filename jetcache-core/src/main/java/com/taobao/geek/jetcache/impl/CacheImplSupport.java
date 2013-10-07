/**
 * Created on  13-09-12 09:51
 */
package com.taobao.geek.jetcache.impl;

import com.taobao.geek.jetcache.*;
import com.taobao.geek.jetcache.support.DefaultKeyGenerator;

/**
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
public class CacheImplSupport {

    public static KeyGenerator getDefaultKeyGenerator() {
        return new DefaultKeyGenerator();
    }

    public static void enableCache(Callback callback) throws CallbackException {
        CacheContextSupport.enableCache(callback);
    }

    public static <T> T enableCache(ReturnValueCallback<T> callback) throws CallbackException {
        return CacheContextSupport.enableCache(callback);
    }

    public static <T> T getProxy(T target, CacheConfig cacheConfig, CacheProviderFactory cacheProviderFactory) {
        return ProxyUtil.getProxy(target, cacheConfig, cacheProviderFactory);
    }

    public static <T> T getProxyByAnnotation(T target, CacheProviderFactory cacheProviderFactory) {
        return ProxyUtil.getProxyByAnnotation(target, cacheProviderFactory);
    }

    public static Object invoke(CacheInvokeContext context) throws Throwable {
        return CacheHandler.invoke(context);
    }
}
