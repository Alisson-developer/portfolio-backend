package portfolio.portfoliobackend.usecase;

import org.springframework.stereotype.Service;
import portfolio.portfoliobackend.domain.entity.ContactMessage;
import portfolio.portfoliobackend.exception.ValidationEntityDataException;

@Service
public interface IContactMessageService {

    void storeContactMessage(ContactMessage contactMessage) throws ValidationEntityDataException;

}
