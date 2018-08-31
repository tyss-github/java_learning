package com.yuceyi.transaction;

public interface AccountService {
    public void transfer(String outer, String inner, int money);
}
