package kz.khairollayev.springsecuritymaster.repository;

import kz.khairollayev.springsecuritymaster.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}