package com.example.banking_app.reposiotry;
import com.example.banking_app.entity.*;
import org.springframework.data.repository.*;

public interface AccountRepository extends JpaRepository<Account, Long> {



}
