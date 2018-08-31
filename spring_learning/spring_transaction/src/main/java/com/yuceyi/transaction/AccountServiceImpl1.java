package com.yuceyi.transaction;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;

public class AccountServiceImpl1 implements AccountService {

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
