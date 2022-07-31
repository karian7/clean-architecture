package io.reflectoring.buckpal.account.application.service;

import org.springframework.stereotype.Component;

import io.reflectoring.buckpal.account.application.port.out.AccountLock;
import io.reflectoring.buckpal.account.domain.Account.AccountId;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
class NoOpAccountLock implements AccountLock {

	@Override
	public void lockAccount(AccountId accountId) {
		log.debug("locking account {}", accountId);
	}

	@Override
	public void releaseAccount(AccountId accountId) {
		log.debug("releasing account {}", accountId);
	}

}
