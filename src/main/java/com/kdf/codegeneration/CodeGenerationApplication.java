package com.kdf.codegeneration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true) // 使得在业务逻辑中获取当前对象的代理对象
public class CodeGenerationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeGenerationApplication.class, args);
    }

}
