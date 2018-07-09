package io.redos.small.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/7/9 12:56
 * @copyright ©2018
 */
@RestController
public class MailU {

    @Autowired
    MailUtil mailUtil;

    @RequestMapping("/send")
    public String sendMail(){
        if (mailUtil.sendSimpleMessage("这是一封测试邮件，来自SpringBoot","这是正文","zonap@qq.com")) {
            return "compelte";
        } else {
            return "uncomplete";
        }
    }
}
