package portfolio.portfoliobackend.usecase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.portfoliobackend.domain.entity.ContactMessage;
import portfolio.portfoliobackend.domain.validateEntity.ValidateContactMessage;
import portfolio.portfoliobackend.exception.ValidationEntityDataException;
import portfolio.portfoliobackend.repository.IContactMessageData;
import portfolio.portfoliobackend.usecase.IContactMessageService;

import java.util.Date;

@Service
public class ContactMessageService implements IContactMessageService {

    @Autowired
    private IContactMessageData contactMessageData;

    @Override
    public void storeContactMessage(ContactMessage contactMessage) throws ValidationEntityDataException {
        ValidateContactMessage.validateData(contactMessage);
        contactMessage.setDate(new Date());
        contactMessageData.save(contactMessage);
    }
}
