package io.redos.small.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/7/9 13:11
 * @copyright ©2018
 */
@Component
public class MailUtil {
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.from}")
    String fromUser;

    private Logger log = LoggerFactory.getLogger(MailUtil.class);

    public boolean sendSimpleMessage(String subject,String text,String toUser){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom(fromUser);
        msg.setTo(toUser);
        msg.setSubject(subject);
        msg.setText(text);
        try {
            javaMailSender.send(msg);
        } catch (Exception ex) {
            log.error("邮件发送失败\n主题：{}\n内容：{}\n接收者：{}",subject,text,toUser);
            return false;
        }
        log.info("邮件发送成功\n主题：{}\n内容：{}\n接收者：{}",subject,text,toUser);
        return true;
    }
}
