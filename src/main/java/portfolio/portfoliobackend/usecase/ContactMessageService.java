package portfolio.portfoliobackend.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.portfoliobackend.domain.entity.ContactMessage;
import portfolio.portfoliobackend.domain.validateEntity.ValidateContactMessage;
import portfolio.portfoliobackend.exception.ValidationEntityDataException;
import portfolio.portfoliobackend.repository.IContactMessageData;

@Service
public class ContactMessageService {

    @Autowired
    private IContactMessageData contactMessageData;

    public void storeContactMessage(ContactMessage contactMessage) throws ValidationEntityDataException {
        ValidateContactMessage.validateData(contactMessage);
        contactMessageData.save(contactMessage);
    }
}
