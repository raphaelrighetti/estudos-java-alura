package org.raphinho.testefluxo.testes;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TesteCharsetUnicode {

    public static void main(String[] args) {

        System.out.println(Charset.defaultCharset());

        String c = "ççççççç";
        byte[] bytes = c.getBytes(StandardCharsets.UTF_8);

        System.out.println(c.codePointAt(0));
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes, StandardCharsets.US_ASCII));
    }
}
