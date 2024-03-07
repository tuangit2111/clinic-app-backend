package com.example.clinic.rest;

import com.example.clinic.entity.EmailDetails;
import com.example.clinic.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/email")
public class EmailRestController {
    private EmailService emailService;
    @Autowired
    public EmailRestController(EmailService emailService) {
        this.emailService = emailService;
    }
    @PostMapping("/sendmail")
    public String sendMail(@RequestBody EmailDetails details) {
        String status = emailService.sendSimpleMail(details);
        return status;
    }
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(
            @RequestBody EmailDetails details)
    {
        String status
                = emailService.sendMailWithAttachment(details);

        return status;
    }
}
