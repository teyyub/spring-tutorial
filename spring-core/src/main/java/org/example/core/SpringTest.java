package org.example.core;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SpringTest {
    public static void main(String[] args) throws IOException {
        Resource resource = new ClassPathResource("config.txt");
        // Spring-in köməkçi (utility) sinfi ilə byte-ları String-ə çeviririk
        byte[] bdata = FileCopyUtils.copyToByteArray(resource.getInputStream());
        String content = new String(bdata, StandardCharsets.UTF_8);

        System.out.println(content);
    }
}
