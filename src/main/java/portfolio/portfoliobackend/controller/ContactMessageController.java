package portfolio.portfoliobackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import portfolio.portfoliobackend.domain.entity.ContactMessage;
import portfolio.portfoliobackend.exception.ValidationEntityDataException;
import portfolio.portfoliobackend.usecase.IContactMessageService;

@RestController
public class ContactMessageController {

    @Autowired
    IContactMessageService contactMessageService;

    @PostMapping("/store-message")
    public void storeContactMessage(@RequestBody ContactMessage contactMessage) throws ValidationEntityDataException {
        contactMessageService.storeContactMessage(contactMessage);
    }
}
