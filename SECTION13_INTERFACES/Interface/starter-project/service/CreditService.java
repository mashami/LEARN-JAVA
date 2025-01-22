package service;

import java.math.BigDecimal;
import pojo.Checking;
import pojo.Credit;
import repository.AccountRepository;

public class CreditService implements AccountService {
  private AccountRepository repository;

  @Override
  public void deposit(String id, BigDecimal amount) {
    Credit account = retrieveAccount(id);
    account.setCredit(account.getCredit().add(amount));
    updateAccount(account);
  }

  @Override
  public void withdraw(String id, BigDecimal amount) {
    Credit account = retrieveAccount(id);
    account.setCredit(account.getCredit().subtract(amount));
    updateAccount(account);
  }

  public CreditService(AccountRepository repository) {
    this.repository = repository;
  }

  public void createAccount(Credit account) {
    this.repository.createAccount(account);
  }

  public Checking retrieveAccount(String id) {
    return (Checking) this.repository.retrieveAccount(id);
  }

  public void updateAccount(Checking account) {
    this.repository.updateAccount(account);
  }

  public void deleteAccount(String id) {
    this.repository.deleteAccount(id);
  }
}
