package io.redos.small.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/7/9 12:57
 * @copyright ©2018
 */
public class MailSenderConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.mail")
    public MailSender mailSender(){
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        return javaMailSender;
    }
}
