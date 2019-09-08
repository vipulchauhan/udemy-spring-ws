package io.vnc.ioc.services;

import org.springframework.stereotype.Service;

@Service
public class BadFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "not gonna perform well";
	}

}
