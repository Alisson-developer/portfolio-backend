package portfolio.portfoliobackend.domain.validateEntity;

import org.springframework.beans.factory.annotation.Value;
import portfolio.portfoliobackend.domain.entity.ContactMessage;
import portfolio.portfoliobackend.exception.ValidationEntityDataException;

public class ValidateContactMessage {

    @Value("validation.message")
    private static String errorMessage;

    public static void validateData(ContactMessage contactMessage) throws ValidationEntityDataException {
        if(contactMessage.getId() == null) {
            throw new ValidationEntityDataException(errorMessage);
        }
        if(contactMessage.getName() == null) {
            throw new ValidationEntityDataException(errorMessage);
        }
        if(contactMessage.getSubject() == null) {
            throw new ValidationEntityDataException(errorMessage);
        }
        if(contactMessage.getMessage() == null) {
            throw new ValidationEntityDataException(errorMessage);
        }
        if(contactMessage.getDate() == null) {
            throw new ValidationEntityDataException(errorMessage);
        }
    }

}
