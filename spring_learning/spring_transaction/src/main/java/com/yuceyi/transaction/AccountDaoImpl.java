package com.yuceyi.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    
    @Override
    public void out(String outer, int money) {
        this.getJdbcTemplate().update("update account set money = money - ? where name = ?", money, outer);
    }

    @Override
    public void in(String inner, int money) {
        if(money < 500) {
            int i = 1/0;
        }
        this.getJdbcTemplate().update("update account set money = money + ? where name = ?", money, inner);
    }
} 
