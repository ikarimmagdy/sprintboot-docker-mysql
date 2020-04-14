package com.docker.demo.services;
import java.util.Optional;

import com.docker.demo.models.Transaction;
import com.docker.demo.repo.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TransactionService {
        @Autowired
        TransactionRepo.TransactionRepository transactionRepository;

        public void saveTransaction(Transaction transaction) {
            transactionRepository.save(transaction);
        }

        public Iterable<Transaction> getTransactionHistory() {
            return transactionRepository.findAll();
        }

        public Optional<Transaction> getTransaction(Long id) {
            return transactionRepository.findById(id);
        }
    }
