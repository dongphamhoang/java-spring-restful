package vn.hoidanit.jobhunter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.jobhunter.service.EmailService;
import vn.hoidanit.jobhunter.util.annotation.ApiMessage;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1")
public class EmailController {
    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/email")
    @ApiMessage("Send sample email")
    public String sendSampleEmail() {
        // this.emailService.sendSampleEmail();
        // this.emailService.sendEmailSync("donghoangtesting@gmail.com", "Test send
        // email", "<h1> <b>Hello </b> </h1>",
        // false,
        // true);
        this.emailService.sendEmailFromTemplateSync("donghoangtesting@gmail.com", "Test send email", "job");
        return "Ok ";
    }

}
