package com.hmdp.utils;

public class RedisConstants {
    // 登录用到的key
    public static final String LOGIN_CODE_KEY = "login:code:";
    public static final Long LOGIN_CODE_TTL = 2L;
    public static final String LOGIN_USER_KEY = "login:token:";
    public static final Long LOGIN_USER_TTL = 36000L;

    // 商品查询用到的key
    public static final String CACHE_SHOP_KEY = "cache:shop:";
    public static final Long CACHE_SHOP_TTL = 30L;

    // 避免缓存穿透
    public static final Long CACHE_NULL_TTL = 2L;

    // 避免缓存击穿
    public static final String LOCK_SHOP_KEY = "lock:shop:";
    public static final Long LOCK_SHOP_TTL = 10L;
    // 异步秒杀
    public static final String SECKILL_STOCK_KEY = "seckill:stock:";
    // 点赞
    public static final String BLOG_LIKED_KEY = "blog:liked:";
    public static final String BLOG_KEY = "blog:";
    // 共同关注
    public static final String FOLLOWS_KEY = "follow:";

}
