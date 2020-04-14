package com.docker.demo.repo;
import com.docker.demo.models.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public class TransactionRepo {

    @Repository
    public interface TransactionRepository extends CrudRepository<Transaction, Long>{

    }
}
