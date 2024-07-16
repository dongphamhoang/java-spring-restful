package vn.hoidanit.jobhunter.service;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final MailSender mailSender;

    public EmailService(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendSampleEmail() {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("donghoangtesting@gmail.com ");
        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World from Spring Boot Email");
        mailSender.send(msg);
    }

}
