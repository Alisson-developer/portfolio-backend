package portfolio.portfoliobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.portfoliobackend.domain.entity.ContactMessage;

@Repository
public interface IContactMessageData extends JpaRepository<ContactMessage, Long> {
}
