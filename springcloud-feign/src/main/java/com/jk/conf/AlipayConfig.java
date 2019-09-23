package com.jk.conf;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101300678881";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCkx0whjzHwy11+qghkDzBaJIEdnkDZSNXJ13HBOySxDX5qOCyFIExYmIzhjPYiR/kgLNy9yCW1nS1EC2Tr65GlrnYChGD7mgEwRgV7G+xUWHDorYVBkh+MsScM3KbM0msOz778/VewYMFdt87EkoTu7afDjI3yBnMhNmGiSfi4QMH2EOhxULzP2ERp6/TgHWrNjvPglgDHHjxrZXla0iSpcaJ/EvYxHdIugh+Un3u2mgMRo9FxsUc6vKGb+tQJbfNK4reJrHQ/8FkVI4zF1puuw7wpiNBw7laITIK4Hm39lB2HmEeFGf3ux4pepekiHQMt9iareLjBo7HF82K14tU9AgMBAAECggEAWzKywCAw08S6ilAxNK/zYvCxRWNBIQFe0ceb/gZt2FBPlxpgCY5GswI7dto9n9uV1mj+A0uzE0FavD5SLQDEK57TUbFSu+4Qmlcm0Wwy8LvCQgVHq3LkY0npAwVcjCApgJkaa4sL7WKfou8IUWOGj3aZU3GHXlyTe95NSzUFo3PMPfQypVQdjnjO3d2x/vsUcYUxaVHkOklWUGG+xl0pfKoh3WYd0BsTDLvE2kpgckv5hldhyG37pBTLouDcoicSDhkJUMr1GGLc3kpcAjGjPNPROmLC7idXr2zrHcgl5aKILuFRC8GZ0d8IeKKmSkPGIFwJTCP+aphIKliDGI22AQKBgQD5c6lemjciW9Y8urbJBkXxAdzErNaH1tpH3Dv9hNxGLNLy8mootphtD+q7yGTlpwlpFp43Yu5eZ1wRpzqWPU8gKqMXEkFvCczsb+UGCDNOG3gdCZx+0MD0KDkprQcz1fSDFX6MMPJbU/HONjbmDhNOyLeLKnXZDJAqLU1ZhDmJdQKBgQCpGp+oYCSJYh71Hh+3cvzxSzuXx+G0s940vqV7GdtVNs6TfbJvXlcS2vU4DZ4cIDClJMwtw6sNvMoJLtGiniJLsWQpfM7qw3a5w8u451LcxkmaSBiarnI6IFqHYTqo1iU1XkWMCLPZH3VzRHkuzUauYZ2fLDlXh78K6LUSrBDbqQKBgF0e2T4wkZ5o7Bv1k6CNj/R9Pn3JC7jf8tJam6ZzP4uO1hzNc+XI7DPiej0pfMjiRzgMsnl4nAVvzkXkyJEnR+95GzLUpMqfvPkSeEt9KjHhPUCRwvLwWOeMUHKHXiXym/mHP5tz9jUzrBPP10SgQoLpmOMBscaZ0wN7r+FX4+a1AoGAYB2T1d4fpj6xHd1rZZfkEToTuyePMGhzykL6R8fglMS8EbUGMKrMjxkI/D0xOwdI3vTVYMWwefRuWV3VJbr//0nqhnI8Ic/LsbaKGqTQwk+qEhkccv7oSgWNrxkigEiHiZf1q6xenPB2j3fB8UoX/JHbR1eZmBi+C3NNSDmos1ECgYEAyO1TCjH/SRVBLzyJMSjpVUpcZHfqT/qmox8Tvpl1rpGnVZaSJThya1TK+/HKs47iHmgS5L7jJIwsVwt19QLoR8nGLYnYLd+EuH0azhOEQT0KxeaUVzBlQTfZwxRPm86tJCrTokfKMW/f75aUpODFsjGt3SJG9IvXTe2tjfDWr/4=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApMdMIY8x8MtdfqoIZA8wWiSBHZ5A2UjVyddxwTsksQ1+ajgshSBMWJiM4Yz2Ikf5ICzcvcgltZ0tRAtk6+uRpa52AoRg+5oBMEYFexvsVFhw6K2FQZIfjLEnDNymzNJrDs++/P1XsGDBXbfOxJKE7u2nw4yN8gZzITZhokn4uEDB9hDocVC8z9hEaev04B1qzY7z4JYAxx48a2V5WtIkqXGifxL2MR3SLoIflJ97tpoDEaPRcbFHOryhm/rUCW3zSuK3iax0P/BZFSOMxdabrsO8KYjQcO5WiEyCuB5t/ZQdh5hHhRn97seKXqXpIh0DLfYmq3i4waOxxfNiteLVPQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://kyd.free.idcfengye.com/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    /*public static String return_url = "http://kyd.free.idcfengye.com/returnUrl";*/
    public static String return_url = "http://localhost:8081/videowh/addHuiYuan";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
