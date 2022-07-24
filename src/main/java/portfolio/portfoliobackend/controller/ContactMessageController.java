package portfolio.portfoliobackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.portfoliobackend.domain.entity.ContactMessage;
import portfolio.portfoliobackend.exception.ValidationEntityDataException;
import portfolio.portfoliobackend.usecase.IContactMessageService;

@RestController
@RequestMapping(name = "/contact")
public class ContactMessageController {

    @Autowired
    IContactMessageService contactMessageService;

    @PostMapping("/store-contact")
    public void storeContactMessage(ContactMessage contactMessage) throws ValidationEntityDataException {
        contactMessageService.storeContactMessage(contactMessage);
    }
}
