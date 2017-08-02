package com.wflqz.base.security;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;

public class SysCodec {
    public static final String RSA_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCfyMWAXrpq/UCwfpZnNuLkE9FEIQdEuP11t3Tn3+b32er9pCc+0ARkhJgx0JzAucMXBxtz3cyRXoaKPjRoBPbaJecB03y2SjBlJPIrKzdGrSuTnfKbSk4ADuGkiItQD75Sc0IZU1vbGn5+G+aSX1pvB0+6gyOF9lt9Zxi/I0ZsDwIDAQAB";
    public static final String RSA_PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJ/IxYBeumr9QLB+lmc24uQT0UQhB0S4/XW3dOff5vfZ6v2kJz7QBGSEmDHQnMC5wxcHG3PdzJFehoo+NGgE9tol5wHTfLZKMGUk8isrN0atK5Od8ptKTgAO4aSIi1APvlJzQhlTW9safn4b5pJfWm8HT7qDI4X2W31nGL8jRmwPAgMBAAECgYAnsv93LJIOoQugjmMaE+X9mvrkfXxL09aNl95A+j1tmUQsbsudbJuayeLyhY1cyQqyvv5QJGx+NckhseDdc1ZNancSC/cPodpUDyWEsbXDJtUmo5J93aWFWQRywF55BIgXcxMVfX+uFmBm/Hyvpq7dqcdWcS1WYwNPsZRhbDOlQQJBANU71jc7gVFMkHI2WMcQGaRomQF4qZ3QBHt203o/bw7Yp3WSsKqeHt7ZE3He0CAWS0TwnFw7rDMHjsqC8X8jby8CQQC/1KcG4QrSt797WhzUtvyJ2Xw+KJODV37ccuK25Q0umVqiNOkVFAYP7niATzp7iS9WEDC2IsR8WR/67mVxXpkhAkEAlXw1WNMmfVAnk2n2ItduoouReC6W+kNyYPuUlgcSXF4WR55mq7Xd/mw/7Xw+e8AlVFc5xo8u0TdjKyVRF8hHkQJARbj47FsnH+eBRUg/amEH8OKHceA1nWtTxLRNCsS9wc4jTwmEHhElEu1OBvTFANmfxtwjmE+Sss+B/CZh4I7NgQJBAIQ8z4IlLRlwDyFDUKKTeQuhyhgDbERbi+BQb9o2OClY9AAAK/lFied11eXovrmEFDdMHQXOqnWWa2lU+3sQc4o=";
    public static final String HMAC_KEY = "Wt2sQ5oDam01LT+vT+QJ4gblP41u3XYnDKQnWGFaIuOqKHYOdPgr6inxIMEBJfFbDd3r+s+LHmYf9YHv0SwteQ==";

    public static String getSalt(String key){
        return DigestUtils.sha256Hex(DigestUtils.md5Hex(key));
    }

    public static String encodeWithSalt(String data, String salt){
        return Md5Crypt.md5Crypt(data.getBytes(), salt);
    }
}
