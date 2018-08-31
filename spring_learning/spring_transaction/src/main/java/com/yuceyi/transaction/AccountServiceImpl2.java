package com.yuceyi.transaction;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.DEFAULT)
public class AccountServiceImpl2 implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(final String outer, final String inner, final int money) {
        accountDao.out(outer, money);
        accountDao.in(inner, money);
    }
}
